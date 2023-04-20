import java.util.Arrays;
import java.util.Scanner;

public class punto11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] histo1, histo2, histo3, histo4, histo5;
        int[] arr = new int[5];
        System.out.println("Ingrese 5 numeros entre 1 y 30, uno por uno: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > 30 || arr[i] < 1)
                while (arr[i] > 30 || arr[i] < 1) {
                    System.out.println("No se permite ese numero, tiene que ser entre 1 y 30");
                    arr[i] = input.nextInt();
                }
        }
        histo1 = new String[arr[0]];
        histo2 = new String[arr[1]];
        histo3 = new String[arr[2]];
        histo4 = new String[arr[3]];
        histo5 = new String[arr[4]];
        Arrays.fill(histo1, "*");
        Arrays.fill(histo2, "*");
        Arrays.fill(histo3, "*");
        Arrays.fill(histo4, "*");
        Arrays.fill(histo5, "*");
        System.out.println(Arrays.toString(histo1) + "\n" + Arrays.toString(histo2) + "\n" + Arrays.toString(histo3)
                + "\n" + Arrays.toString(histo4) + "\n" + Arrays.toString(histo5));
        input.close();
    }
}
