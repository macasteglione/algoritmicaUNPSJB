import java.util.Arrays;
import java.util.Random;

public class punto12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10);
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length - 1; j++)
                if (arr[i] == arr[j + 1])
                    arr[j + 1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
