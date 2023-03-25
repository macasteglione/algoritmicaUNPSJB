import java.util.Arrays;
import java.util.Scanner;

public class punto10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();
        int[] numeros = new int[num];
        System.out.println("Ahora ingrese " + num + " numeros, uno por uno: ");
        for (int i = 0; i < num; i++)
            numeros[i] = input.nextInt();
        Arrays.sort(numeros);
        System.out.println("El numero menor es " + numeros[0]);
        input.close();
    }
}
