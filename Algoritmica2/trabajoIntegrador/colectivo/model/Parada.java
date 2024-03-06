package colectivo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una parada de colectivo.
 * 
 * @author Matias Casteglione
 */
public class Parada {
    private String id;
    private String direccion;
    private List<Linea> lineas;
    private List<Pasajero> pasajeros;

    /**
     * Constructor de la clase Parada.
     * 
     * @param id        el ID de la parada
     * @param direccion la direccion de la parada
     * @param pasajeros la lista de pasajeros en la parada
     */
    public Parada(String id, String direccion, List<Pasajero> pasajeros) {
        this.id = id;
        this.direccion = direccion;
        this.lineas = new ArrayList<>();
        this.pasajeros = pasajeros;
    }

    /**
     * Obtiene el ID de la parada.
     * 
     * @return el ID de la parada
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene la direccion de la parada.
     * 
     * @return la direccion de la parada
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene la lista de lineas a las que pertenece la parada.
     * 
     * @return la lista de lineas a las que pertenece la parada
     */
    public List<Linea> getLineas() {
        return lineas;
    }

    /**
     * Establece la lista de lineas a las que pertenece la parada.
     * 
     * @param lineas la lista de lineas
     */
    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    /**
     * Obtiene la lista de pasajeros en la parada.
     * 
     * @return la lista de pasajeros en la parada
     */
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        List<String> lineaIDs = new ArrayList<>();
        for (Linea linea : lineas)
            lineaIDs.add(linea.getId());
        return "Parada [id: " + id + ", direccion: " + direccion + ", lineas: " + lineaIDs + ", pasajeros: "
                + pasajeros.size() + "]\n";
    }
}