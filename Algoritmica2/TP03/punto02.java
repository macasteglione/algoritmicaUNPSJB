import java.util.Arrays;
import java.util.Random;

public class punto02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];

        for (int i = 0; i < numeros1.length; i++)
            numeros1[i] = rand.nextInt(10);

        Arrays.fill(numeros2, 9);
        System.out.println(Arrays.toString(numeros2));

        System.out.println(Arrays.toString(numeros1));

        Arrays.sort(numeros1);
        System.out.println(Arrays.toString(numeros1));

        numeros2 = Arrays.copyOf(numeros1, numeros1.length);
        System.out.println(Arrays.toString(numeros2));

        System.out.println(Arrays.equals(numeros1, numeros2));

        int[] numeros3 = Arrays.copyOfRange(numeros2, 2, 5);
        System.out.println(Arrays.toString(numeros3));

        System.out.println(Arrays.binarySearch(numeros1, 1));
    }
}
