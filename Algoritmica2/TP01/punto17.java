import java.util.Scanner;

public class punto17 {
    static double hipo(double co, double ca) {
        double h = Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
        return h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la medida del cateto opuesto: ");
        double co = input.nextInt();
        System.out.print("Ahora ingrese la medida del cateto adyacente: ");
        double ca = input.nextInt();
        double h = hipo(co, ca);
        System.out.println("La hipotenusa es: " + (int) h);
        input.close();
    }
}
