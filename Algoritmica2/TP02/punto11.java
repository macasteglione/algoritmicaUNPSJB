import java.util.ArrayList;
import java.util.List;
import operaciones.Empleado;
import operaciones.Factura;
import operaciones.Item;

public class punto11 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "1233"));
        empleados.add(new Empleado("Fabri", "12243"));
        empleados.add(new Empleado("Gabi", "4565673"));

        List<Factura> facturas = new ArrayList<>();
        List<Item> items1 = new ArrayList<>(); 
        items1.add(new Item("chocolate", 100, 4));
        items1.add(new Item("papas", 50, 50));
        Factura factura1 = new Factura("lola", "12/07/1200", 1001, items1);
        facturas.add(factura1);
    }
}
