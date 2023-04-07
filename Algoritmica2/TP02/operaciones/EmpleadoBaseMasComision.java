package operaciones;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String numeroDocumento, double porcentajeComision,
            double ventasBrutas,
            double salarioBase) {
        super(nombre, numeroDocumento, porcentajeComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}