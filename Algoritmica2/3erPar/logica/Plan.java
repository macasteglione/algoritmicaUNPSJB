package logica;

public class Plan {

    private String nombre;
    private double tarifa;

    public Plan(String nombre, double tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Plan [nombre=" + nombre + ", tarifa=" + tarifa + "]";
    }
}
