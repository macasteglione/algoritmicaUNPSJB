import logica.*;

public class Test {
    public static void main(String[] args) {
        Alquiler a1[] = new Alquiler[3];

        a1[0] = new Alquiler(new Cliente("Pepe", "2331"), new Moto(5545, "papa", "IJH998", 100), 100, 2330);
        a1[1] = new Alquiler(new Cliente("Martin", "554445"), new TodoTerreno(2300, "caca", "caca123", 10000, 233), 440, 340);
        a1[2] = new Alquiler(new Cliente("Juan", "233255"), new Coche(2001, "null", "sf22", 233), 1120, 30);

        for (Alquiler a : a1)
            System.out.println(a.getCliente().toString() + ", " + a.getVehiculo() + " A pagar $" + a.getVehiculo().calcularAlquiler(a.getCantDias(), a.getCantKms()));
    }
}
