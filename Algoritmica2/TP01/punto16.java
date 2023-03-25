public class punto16 {
    public static void main(String[] args) {
        double f = 4;
        for (int i = 3; i <= 50; i += 2)
            f = f - (4.0 / i) + (4.0 / i + 2);
        System.out.println(f);
    }
}
