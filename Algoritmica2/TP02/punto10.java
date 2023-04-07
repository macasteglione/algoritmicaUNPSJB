import operaciones.EmpleadoBaseMasComision;
import operaciones.EmpleadoPorComision;
import operaciones.EmpleadoAsalariado;
import operaciones.EmpleadoPorHora;
import operaciones.Empleado;
import java.util.ArrayList;
import java.util.List;

public class punto10 {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoBaseMasComision("Paula", "345787675", 0.6, 4000, 2000));
        listaEmpleados.add(new EmpleadoPorComision("Tiago", "23487348", 0.1, 50000));
        listaEmpleados.add(new EmpleadoAsalariado("Ana Gomez", "23456789", 2000.0));
        listaEmpleados.add(new EmpleadoPorHora("Julio", "3443265", 100, 10000));

        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " Salario: $");

            if (empleado instanceof EmpleadoAsalariado) {
                EmpleadoAsalariado empleadoAsalariado = (EmpleadoAsalariado) empleado;
                System.out.println(empleadoAsalariado.getSalarioMensual());
            }
            else if (empleado instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleadoBaseMasComision = (EmpleadoBaseMasComision) empleado;
                System.out.println((empleadoBaseMasComision.getVentasBrutas() * empleadoBaseMasComision.getPorcentajeComision() + empleadoBaseMasComision.getSalarioBase()) * 1.1);
            }
            else if (empleado instanceof EmpleadoPorComision) {
                EmpleadoPorComision empleadoPorComision = (EmpleadoPorComision) empleado;
                System.out.println(empleadoPorComision.getVentasBrutas() * empleadoPorComision.getPorcentajeComision());

            }
        }
    }
}
