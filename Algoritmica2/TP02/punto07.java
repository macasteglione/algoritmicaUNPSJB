import operaciones.EmpleadoBaseMasComision;
import operaciones.EmpleadoPorComision;
import operaciones.EmpleadoAsalariado;
import operaciones.EmpleadoPorHora;
import operaciones.Empleado;

public class punto07 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Martin", "12345678");
        System.out.println(
                "Empleado: " + empleado.getNombre() + "\nNum. de documento: " + empleado.getNumeroDocumento());

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Ana Gomez", "23456789", 2000.0);
        System.out.println("Nombre: " + empleadoAsalariado.getNombre() + "\nNum. de documento: "
                + empleadoAsalariado.getNumeroDocumento() + "\nSalario mensual: $"
                + empleadoAsalariado.getSalarioMensual());

        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Julio", "3443265", 100, 10000);
        System.out.println("Nombre: " + empleadoPorHora.getNombre() + "\nNum. de documento: "
                + empleadoPorHora.getNumeroDocumento() + "\nValor por hora: " + empleadoPorHora.getValorHora()
                + "\nHoras trabajadas: " + empleadoPorHora.getHorasTrabajadas());

        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Tiago", "23487348", 0.1, 50000);
        System.out.println("Nombre: " + empleadoPorComision.getNombre() + "\nNum. de documento: "
                + empleadoPorComision.getNumeroDocumento() + "\nPorcentaje por comision: "
                + empleadoPorComision.getPorcentajeComision() * 100 + "%" + "\nVentas brutas: "
                + empleadoPorComision.getVentasBrutas());

        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Paula", "345787675", 0.6, 4000,
                2000);
        System.out.println("Nombre: " + empleadoBaseMasComision.getNombre() + "\nNum. de documento: "
                + empleadoBaseMasComision.getNumeroDocumento() + "\nPorcentaje de comision: "
                + empleadoBaseMasComision.getPorcentajeComision() + "\nVentas Brutas: "
                + empleadoBaseMasComision.getVentasBrutas() + "\nSalario base: "
                + empleadoBaseMasComision.getSalarioBase());
    }
}
