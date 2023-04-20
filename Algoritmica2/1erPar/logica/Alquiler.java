package logica;

public class Alquiler {

    private int cantDias, cantKms;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, int cantDias, int cantKms) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cantDias = cantDias;
        this.cantKms = cantKms;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public int getCantKms() {
        return cantKms;
    }

    public void setCantKms(int cantKms) {
        this.cantKms = cantKms;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Alquiler: [cantDias=" + cantDias + ", cantKms=" + cantKms + "]";
    }
}
