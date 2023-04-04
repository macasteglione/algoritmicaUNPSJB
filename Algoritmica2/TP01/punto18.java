import java.util.Scanner;

public class punto18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operaciones convert = new Operaciones();
        System.out.println("Conversor de temperaturas: \n1) fahr a cels\n2) cels a fahr");
        int menu = input.nextInt();
        System.out.print("Ingrese el valor de temperatura: ");
        Double temp = input.nextDouble();
        if (menu == 1) {
            convert.fahrACels(temp);
            System.out.println("El resultado es " + String.format("%.2f", temp) + "°C");
        } else if (menu == 2) {
            convert.celsAFahr(temp);
            System.out.println("El resultado es " + String.format("%.2f", temp) + "°F");
        } else
            System.out.println("Opción no válida");
        input.close();
    }
}