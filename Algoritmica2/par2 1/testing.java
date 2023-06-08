import java.util.ArrayList;

public class testing {
    public static void main(String[] args) {
        
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("hola");
        l1.add("null");
        l1.add("qsy");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("hola");
        l2.add("null");

        System.out.println("Lista 1: " + l1);
        System.out.println("Lista 2: " + l2);
        System.out.println("Contiene todo? " + l1.containsAll(l2));
    }
}
