import java.util.Scanner;

public class punto03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num1 = input.nextInt();
        System.out.print("Escriba otro numero: ");
        int num2 = input.nextInt();
        if (num1 > num2)
            System.out.println(num1 + " es el numero mas grande.");
        else
            System.out.println(num2 + " es el numero mas grande.");
        if (num1 == num2)
            System.out.println("Los dos numeros son iguales");
        input.close();
    }
}
