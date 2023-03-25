import java.util.Arrays;
import java.util.Scanner;

public class punto09 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese diez numeros, uno por uno: ");
        for (int i = 0; i < 10; i++)
            numeros[i] = input.nextInt();
        Arrays.sort(numeros);
        System.out.println("El numero mayor es " + numeros[numeros.length - 1] + ", y el menor es " + numeros[0]);
        input.close();
    }
}
