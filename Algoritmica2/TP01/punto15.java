public class punto15 {
    static long factorial(long n) {
        long fact = 1;
        for (long i = n; i >= 1; i--)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        double f = 1;
        for (long i = 1; i <= 50; i++)
            f = f + (1.0 / factorial(i));
        System.out.println(f);
    }
}
