package operaciones;

public class Item {
    private String descripcion;
    private double precioUnitario;
    private int cantidadComprada;

    public Item(String descripcion, double precioUnitario, int cantidadComprada) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadComprada = cantidadComprada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
}
