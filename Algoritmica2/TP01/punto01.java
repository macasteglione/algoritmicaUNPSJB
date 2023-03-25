import java.util.Scanner;

public class punto01 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner res = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        num1 = res.nextInt();
        System.out.print("Escribe otro numero: ");
        num2 = res.nextInt();
        System.out.println("El resultado de la suma es: " + (num1 + num2) +
                "\nEl resultado de la resta es: " + (num1 - num2) +
                "\nEl resultado del producto es: " + (num1 * num2) +
                "\nEl resultado del cociente es: " + (num1 / num2));
        res.close();
    }
}