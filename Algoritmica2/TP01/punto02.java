import java.util.Scanner;

public class punto02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba el numero del radio del circulo: ");
        int r = input.nextInt();
        System.out.println("El diametro de la circunferencia es: " + (2 * r) +
                "\nLa circunferencia es: " + (2 * Math.PI * r) +
                "\nEl area del circulo es: " + (Math.PI * Math.pow(r, 2)));
        input.close();
    }
}
