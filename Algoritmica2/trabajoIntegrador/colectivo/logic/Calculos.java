package colectivo.logic;

import java.util.List;
import java.util.Random;
import colectivo.model.*;

/**
 * Clase que contiene metodos para realizar calculos relacionados con el sistema
 * de colectivos.
 * 
 * @author Matias Casteglione
 */
public class Calculos {

    /**
     * Genera pasajeros aleatoriamente y los asigna a las paradas de las lineas.
     *
     * @param lineas         la lista de lineas
     * @param pasajerosTotal el numero total de pasajeros a generar
     */
    public void generarPasajeros(List<Linea> lineas, int pasajerosTotal) {
        Random random = new Random();
        while (pasajerosTotal > 0)
            for (Linea linea : lineas) {
                for (int i = 0; i < linea.getParadas().size() - 1; i++) {
                    Parada parada = linea.getParadas().get(i);
                    if (pasajerosTotal <= 0)
                        break;
                    int distribucionPasajeros = random.nextInt(20);
                    pasajerosTotal -= distribucionPasajeros;
                    for (int j = 0; j < distribucionPasajeros; j++) {
                        Parada paradaDestino = linea.getParadas()
                                .get(random.nextInt(linea.getParadas().size() - i - 1) + i + 1);
                        Pasajero pasajero = new Pasajero(parada, paradaDestino);
                        parada.getPasajeros().add(pasajero);
                    }
                }
            }
    }

    /**
     * Calcula el indice de satisfaccion del cliente a partir de las calificaciones
     * recibidas.
     *
     * @param calificaciones la lista de calificaciones de los pasajeros
     */
    public void calcularIndiceSatisfaccion(List<Integer> calificaciones) {
        int[] calificacionesCont = new int[6];
        int totalPasajeros = calificaciones.size();
        double totalPuntos = 0;
        for (int calificacion : calificaciones)
            if (calificacion >= 1 && calificacion <= 5) {
                calificacionesCont[calificacion]++;
                totalPuntos += calificacion;
            }
        double indiceSatisfaccion = totalPuntos / (100 * totalPasajeros);
        System.out.println("Indice de satisfacción del cliente: " + (indiceSatisfaccion * 100) + "%");
        for (int i = 5; i >= 1; i--)
            System.out.println(calificacionesCont[i] + " pasajeros calificaron con " + i + " el servicio");
    }

    /**
     * Calcula la ocupacion promedio del colectivo en funcion de los pasajeros
     * transportados.
     *
     * @param colectivo              el colectivo
     * @param pasajerosTransportados el numero de pasajeros transportados
     */
    public void calcularOcupacionPromedio(Colectivo colectivo, int pasajerosTransportados) {
        int totalTramos = colectivo.getLinea().getParadas().size() - 1;
        double promedioOcupacion = (double) pasajerosTransportados
                / (double) (totalTramos * colectivo.getTotalPasajeros());
        System.out.println("Pasajeros transportados: " + pasajerosTransportados + ". Ocupación promedio: "
                + (promedioOcupacion * 100) + "%");
    }
}