package logica;

public abstract class Cliente {

    private int nroCliente;
    private String nombre;
    private Plan plan;

    public Cliente(int nroCliente, String nombre, Plan plan) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.plan = plan;
    }

    public abstract double calcularFactura();

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
