package logica;

public class Empresa extends Cliente {

    private double baseEmpresa;
    private static int cantEmpleados;

    public Empresa(int nroCliente, String nombre, Plan plan, double baseEmpresa, int cantEmpleados) {
        super(nroCliente, nombre, plan);
        this.baseEmpresa = baseEmpresa;
    }

    @Override
    public double calcularFactura() {
        return baseEmpresa + super.getPlan().getTarifa();
    }

    public double getBaseEmpresa() {
        return baseEmpresa;
    }

    public void setBaseEmpresa(double baseEmpresa) {
        this.baseEmpresa = baseEmpresa;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        Empresa.cantEmpleados = cantEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa [baseEmpresa=" + baseEmpresa + ", cantEmpleados=" + cantEmpleados + "]";
    }
}
