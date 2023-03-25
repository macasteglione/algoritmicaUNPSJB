public class punto07 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " - " + (int) Math.pow(num, 2) + " - " + (int) Math.pow(num, 3));
            num++;
        }
    }
}
