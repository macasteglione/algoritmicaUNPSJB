package colectivo.logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import colectivo.model.*;

public class Simulacion {
    private List<Linea> lineas;
    private List<Parada> paradas;
    private List<Colectivo> colectivos;
    private Properties config;
    private Map<String, Integer> pasajerosPorParada;

    public Simulacion(List<Linea> lineas, List<Parada> paradas, List<Colectivo> colectivos, Properties config) {
        this.lineas = lineas;
        this.paradas = paradas;
        this.colectivos = colectivos;
        this.config = config;
        this.pasajerosPorParada = new HashMap<>();
    }

    public void ejecutar() {
        int duracionSimulacion = Integer.parseInt(config.getProperty("duracion_simulacion"));
        int intervaloActualizacion = Integer.parseInt(config.getProperty("intervalo_actualizacion"));
        for (int i = 1; i <= duracionSimulacion; i++) {
            System.out.println("----- Iteración " + i + " -----");
            // Generar pasajeros en las paradas
            generarPasajerosEnParadas();
            // Mostrar información de los colectivos y las paradas
            mostrarInformacionColectivosParadas();
            // Simular el movimiento de los colectivos y la interacción con los pasajeros
            moverColectivos();
            // Actualizar el estado de los colectivos
            actualizarEstadoColectivos();
            try {
                Thread.sleep(intervaloActualizacion * 1000); // Esperar el intervalo de actualización en segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Mostrar estadísticas finales de la simulación
        mostrarEstadisticasFinales();
    }

    private void generarPasajerosEnParadas() {
        int cantidadPasajerosMin = Integer.parseInt(config.getProperty("cantidad_pasajeros_min"));
        int cantidadPasajerosMax = Integer.parseInt(config.getProperty("cantidad_pasajeros_max"));
        for (Parada parada : paradas) {
            int cantidadPasajeros = (int) (Math.random() * (cantidadPasajerosMax - cantidadPasajerosMin + 1))
                    + cantidadPasajerosMin;
            pasajerosPorParada.put(parada.getId(), cantidadPasajeros);
        }
    }

    private void mostrarInformacionColectivosParadas() {
        System.out.println("----- Colectivos -----");
        for (Colectivo colectivo : colectivos)
            System.out.println(colectivo);
        System.out.println("----- Paradas -----");
        for (Parada parada : paradas)
            System.out.println(parada + " - Pasajeros: " + pasajerosPorParada.get(parada.getId()));
    }

    private void moverColectivos() {
        for (Colectivo colectivo : colectivos) {
            Linea linea = obtenerLineaPorId(colectivo.getLinea().getId());
            List<Parada> paradasLinea = linea.getParadas();
            int indiceActual = paradasLinea.indexOf(colectivo.getParadaActual());
            int siguienteIndice = (indiceActual + 1) % paradasLinea.size(); // Siguiente parada circular
            Parada siguienteParada = paradasLinea.get(siguienteIndice);
            colectivo.setParadaActual(siguienteParada);
            int pasajerosBajados = bajarPasajeros(colectivo, siguienteParada);
            int pasajerosSubidos = subirPasajeros(colectivo, siguienteParada);
            System.out.println("Colectivo " + colectivo.getId() + " - Parada " + siguienteParada.getId()
                    + " - Pasajeros bajados: " + pasajerosBajados + " - Pasajeros subidos: " + pasajerosSubidos);
        }
    }

    private int bajarPasajeros(Colectivo colectivo, Parada parada) {
        List<Pasajero> pasajeros = colectivo.getPasajeros();
        int pasajerosBajados = 0;
        for (int i = pasajeros.size() - 1; i >= 0; i--) {
            Pasajero pasajero = pasajeros.get(i);
            if (pasajero.getDestino().equals(parada.getId())) {
                pasajeros.remove(i);
                pasajerosBajados++;
            }
        }
        return pasajerosBajados;
    }

    private int subirPasajeros(Colectivo colectivo, Parada parada) {
        int capacidadColectivo = colectivo.getTotalPasajeros();
        List<Pasajero> pasajeros = colectivo.getPasajeros();
        int pasajerosSubidos = 0;
        int disponibles = capacidadColectivo - pasajeros.size();
        int pasajerosEnParada = pasajerosPorParada.getOrDefault(parada.getId(), 0);
        int subir = Math.min(disponibles, pasajerosEnParada);
        for (int i = 0; i < subir; i++) {
            Parada destinoAleatoria = obtenerParadaDestinoAleatoria(parada);
            Pasajero pasajero = new Pasajero(parada.getId(), obtenerCalificacionAleatoria(), destinoAleatoria);
            colectivo.agregarPasajero(pasajero);
            pasajerosSubidos++;
        }
        pasajerosPorParada.put(parada.getId(), pasajerosEnParada - subir);
        return pasajerosSubidos;
    }

    private int obtenerCalificacionAleatoria() {
        Random random = new Random();
        // Generar un número aleatorio entre 1 y 5 (inclusive)
        int calificacion = random.nextInt(5) + 1;
        return calificacion;
    }

    private Parada obtenerParadaDestinoAleatoria(Parada paradaActual) {
        List<Parada> paradasDestino = new ArrayList<>(paradas);
        paradasDestino.remove(paradaActual);
        int indiceAleatorio = (int) (Math.random() * paradasDestino.size());
        return paradasDestino.get(indiceAleatorio);
    }

    private void actualizarEstadoColectivos() {
        for (Colectivo colectivo : colectivos)
            colectivo.setCombustible(colectivo.getCombustible() - 1); // Reducir el combustible en 1
    }

    private void mostrarEstadisticasFinales() {
        System.out.println("----- Estadísticas finales -----");
        for (Colectivo colectivo : colectivos)
            System.out.println("Colectivo " + colectivo.getId() + " - Combustible restante: "
                    + colectivo.getCombustible() + " - Pasajeros: " + colectivo.getPasajeros().size());
    }

    private Linea obtenerLineaPorId(String lineaId) {
        for (Linea linea : lineas)
            if (linea.getId().equals(lineaId))
                return linea;
        return null;
    }
}