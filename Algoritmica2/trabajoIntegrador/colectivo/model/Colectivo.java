package colectivo.model;

import java.util.List;

/**
 * Clase que representa un colectivo.
 * 
 * @author Matias Casteglione
 */
public class Colectivo {
    private String id;
    private int asientos;
    private int totalPasajeros;
    private List<Pasajero> pasajeros;
    private Linea linea;

    /**
     * Constructor de la clase Colectivo.
     * 
     * @param id              el ID del colectivo
     * @param asientos        el numero total de asientos del colectivo
     * @param totalPasajeros  la capacidad maxima de pasajeros del colectivo
     * @param pasajeros       la lista de pasajeros actualmente en el colectivo
     * @param linea           la linea a la que pertenece el colectivo
     */
    public Colectivo(String id, int asientos, int totalPasajeros, List<Pasajero> pasajeros, Linea linea) {
        this.id = id;
        this.asientos = asientos;
        this.totalPasajeros = totalPasajeros;
        this.pasajeros = pasajeros;
        this.linea = linea;
    }

    /**
     * Obtiene el ID del colectivo.
     * 
     * @return el ID del colectivo
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene la capacidad maxima de pasajeros del colectivo.
     * 
     * @return la capacidad maxima de pasajeros del colectivo
     */
    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    /**
     * Obtiene la lista de pasajeros actualmente en el colectivo.
     * 
     * @return la lista de pasajeros actualmente en el colectivo
     */
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    /**
     * Establece la lista de pasajeros del colectivo.
     * 
     * @param pasajeros la lista de pasajeros a establecer
     */
    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * Obtiene la linea a la que pertenece el colectivo.
     * 
     * @return la linea a la que pertenece el colectivo
     */
    public Linea getLinea() {
        return linea;
    }

    /**
     * Establece la linea a la que pertenece el colectivo.
     * 
     * @param linea la linea a establecer
     */
    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    /**
     * Obtiene la cantidad de asientos disponibles en el colectivo.
     * 
     * @return la cantidad de asientos disponibles en el colectivo
     */
    public int getAsientosDisponibles() {
        return asientos - pasajeros.size();
    }

    @Override
    public String toString() {
        return "Colectivo [id: " + id + "\nAsientos: " + asientos + "\ntotalPasajeros: " + totalPasajeros
                + "\npasajeros: " + pasajeros.size() + ", Linea: " + linea + "]\n";
    }
}