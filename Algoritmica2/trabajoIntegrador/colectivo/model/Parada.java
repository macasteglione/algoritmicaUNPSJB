package colectivo.model;

public class Parada {
    private String id;
    private String direccion;

    public Parada(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", direccion=" + direccion + "]";
    }
}