import logica.*;
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        int a[] = {4, 2, 8, 7, 1, 9, 5};
        Factorial f = new Factorial();
        f.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
