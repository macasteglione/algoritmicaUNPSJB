import java.util.Scanner;

public class punto08 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contP, contN, zero;
        contP = contN = zero = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese diez numeros, uno por uno: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] > 0)
                contP++;
            if (numeros[i] < 0)
                contN++;
            if (numeros[i] == 0)
                zero++;
        }
        System.out.println("Hay " + contP + " numeros positivos, "
                + contN + " numeros negativos y " + zero + " ceros.");
        input.close();
    }
}
