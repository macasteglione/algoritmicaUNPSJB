import java.util.Scanner;

public class punto05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num1 = input.nextInt();
        System.out.print("Escriba otro numero: ");
        int num2 = input.nextInt();
        if (num1 % num2 == 0)
            System.out.println(num1 + " es multiplo de " + num2);
        else
            System.out.println(num1 + " NO es multiplo de " + num2);
        input.close();
    }
}
