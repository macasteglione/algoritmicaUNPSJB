import java.util.Scanner;

public class punto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num1 = input.nextInt();
        if (num1 % 2 == 0)
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar");
        input.close();
    }
}
