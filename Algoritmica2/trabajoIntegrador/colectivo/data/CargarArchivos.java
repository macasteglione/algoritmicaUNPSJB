package colectivo.data;

import colectivo.logic.Calculos;
import colectivo.model.Colectivo;
import colectivo.model.Linea;
import colectivo.model.Parada;
import colectivo.model.Pasajero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de cargar los datos del sistema desde archivos y 
 * devolver las listas de los datos.
 * 
 * @author Matias Casteglione
 */
public class CargarArchivos {
    private static List<Colectivo> colectivos;
    private static List<Linea> lineas;
    private static List<Parada> paradas;
    private static List<Pasajero> totalPasajeros = new ArrayList<>();
    private static int recorridos;
    private static int totalPasajerosConfig;

    /**
     * Carga los datos del sistema desde archivos y genera la lista de pasajeros.
     */
    public static void cargarDatos() {
        Datos system = new Datos();
        Calculos calc = new Calculos();
        try {
            system.cargarConfiguracion("config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        lineas = system.getLineas();
        paradas = system.getParadas();
        colectivos = system.getColectivos();
        recorridos = system.getRecorridos();
        totalPasajerosConfig = system.getTotalPasajeros();
        calc.generarPasajeros(lineas, totalPasajerosConfig);
    }

    /**
     * Obtiene la lista de colectivos cargados en el sistema.
     *
     * @return la lista de colectivos
     */
    public static List<Colectivo> getColectivos() {
        return colectivos;
    }

    /**
     * Obtiene la lista de lineas cargadas en el sistema.
     *
     * @return la lista de lineas
     */
    public static List<Linea> getLineas() {
        return lineas;
    }

    /**
     * Obtiene la lista de paradas cargadas en el sistema.
     *
     * @return la lista de paradas
     */
    public static List<Parada> getParadas() {
        return paradas;
    }

    /**
     * Obtiene el numero de recorridos configurados en el sistema.
     *
     * @return el numero de recorridos
     */
    public static int getRecorridos() {
        return recorridos;
    }

    /**
     * Obtiene el numero total de pasajeros configurado en el sistema.
     *
     * @return el numero total de pasajeros
     */
    public static int getTotalPasajerosConfig() {
        return totalPasajerosConfig;
    }

    /**
     * Obtiene la lista de todos los pasajeros generados en el sistema.
     *
     * @return la lista de pasajeros
     */
    public static List<Pasajero> getTotalPasajeros() {
        return totalPasajeros;
    }
}