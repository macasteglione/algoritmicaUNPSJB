import java.util.Scanner;

public class punto14 {
    static long factorial(long n) {
        long fact = 1;
        for (long i = n; i >= 1; i--)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial: ");
        long num = input.nextInt();
        long res = factorial(num);
        System.out.println(res);
        input.close();
    }
}
