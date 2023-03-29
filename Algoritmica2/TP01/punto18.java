import java.util.Scanner;

public class punto18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;
        System.out.println("Conversor de temperaturas: \n1) fahr a cels\n2) cels a fahr");
        int menu = input.nextInt();
        System.out.print("Ingrese el valor de temperatura: ");
        temp = input.nextDouble();
        if (menu == 1) {
            temp = 5.0 / 9.0 * (temp - 32);
            System.out.printf("El resultado es " + String.format("%.2f", temp) + "°C");
        } else if (menu == 2) {
            temp = 9.0 / 5.0 * temp + 32;
            System.out.println("El resultado es " + String.format("%.2f", temp) + "°F");
        } else {
            System.out.println("Opción no válida");
        }
        input.close();
    }
}

/*
 * Los cambios que realicé fueron los siguientes:
 * 
 * Eliminé los métodos fahrToCent y centToFahr ya que sólo se utilizaban una vez
 * en todo el código.
 * Simplifiqué el switch por medio de una estructura if-else, lo que permite un
 * código más fácil de leer.
 * En lugar de usar input.nextInt(), cambié a input.nextDouble() ya que permite
 * ingresar números con decimales y hacer operaciones aritméticas más precisas.
 * Agregué un mensaje de "Opción no válida" en caso de que se ingrese un número
 * que no sea 1 o 2 en el menú.
 */