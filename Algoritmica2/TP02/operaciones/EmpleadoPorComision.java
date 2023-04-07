package operaciones;

public class EmpleadoPorComision extends Empleado {
    private double porcentajeComision, ventasBrutas;

    public EmpleadoPorComision(String nombre, String numeroDocumento, double porcentajeComision, double ventasBrutas) {
        super(nombre, numeroDocumento);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
}
