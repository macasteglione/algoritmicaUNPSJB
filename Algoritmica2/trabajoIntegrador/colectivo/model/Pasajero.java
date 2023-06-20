package colectivo.model;

public class Pasajero {
    private String id;
    private int calificacion;
    private Parada destino;

    public Pasajero(String id, int calificacion, Parada destino) {
        this.id = id;
        this.calificacion = calificacion;
        this.destino = destino;
    }

    public String getId() {
        return id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Parada getDestino() {
        return destino;
    }
}