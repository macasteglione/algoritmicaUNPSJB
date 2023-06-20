package colectivo.model;

import java.util.ArrayList;
import java.util.List;

public class Colectivo {
    private String id;
    private Linea linea;
    private int cantidadAsientos;
    private int totalPasajeros;
    private List<Pasajero> pasajeros;
    private Parada paradaActual;
    private int combustible;

    public Colectivo(String id, Linea linea, int cantidadAsientos, int totalPasajeros) {
        this.id = id;
        this.linea = linea;
        this.cantidadAsientos = cantidadAsientos;
        this.totalPasajeros = totalPasajeros;
        pasajeros = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public Linea getLinea() {
        return linea;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void eliminarPasajero(Pasajero pasajero) {
        pasajeros.remove(pasajero);
    }

    @Override
    public String toString() {
        return "[id=" + id + ", linea=" + linea.getId() + "]";
    }

    public void setParadaActual(Parada siguienteParada) {
        this.paradaActual = siguienteParada;
    }

    public Parada getParadaActual() {
        return paradaActual;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}