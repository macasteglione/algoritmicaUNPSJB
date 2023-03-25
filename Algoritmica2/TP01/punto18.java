import java.util.Scanner;

public class punto18 {
    public static double fahrToCent(double f) {
        double cent = 5.0 / 9.0 * (f - 32);
        return cent;
    }

    public static double centToFahr(double c) {
        double fahr = 9.0 / 5.0 * c + 32;
        return fahr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;
        System.out.println("Conversor de temperaturas: \n1) fahr a cels\n2) cels a fahr");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.print("Ingrese el valor de temperatura: ");
                temp = input.nextInt();
                temp = fahrToCent(temp);
                System.out.printf("El resultado es " + String.format("%.2f", temp) + "°C");
                break;
            case 2:
                System.out.print("Ingrese el valor de temperatura: ");
                temp = input.nextInt();
                temp = centToFahr(temp);
                System.out.println("El resultado es " + String.format("%.2f", temp) + "°F");
            default:
                break;
        }
        input.close();
    }
}
