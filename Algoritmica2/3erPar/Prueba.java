import logica.*;

public class Prueba {
    public static void main(String[] args) {
        Cliente c1[] = new Cliente[5];
        
        c1[0] = new Persona(10, "caca", new Plan("qsy", 1000), 20, true);
        c1[1] = new Persona(20, "caca2", new Plan("qsy2", 10), 20, true);
        c1[2] = new Persona(30, "caca4", new Plan("qsy4", 10), 20, true);

        for (Cliente cli : c1)
            System.out.println(cli.calcularFactura());
    }
}
