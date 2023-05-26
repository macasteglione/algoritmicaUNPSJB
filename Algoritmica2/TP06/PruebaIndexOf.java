
import logica.datastructures.*;

public class PruebaIndexOf {
    public static void main(String[] args) {
        PositionalList<String> l1 = new LinkedPositionalList<>();

        Position<String> p1 = l1.addFirst("manzana");
        Position<String> p2 = l1.addAfter(p1, "pepe");
        Position<String> p3 = l1.addAfter(p2, "Orange");

        System.out.println("Indice de p1: " + l1.indexOf(p1) + "\nIndice de p2: " + l1.indexOf(p2) + "\nIndice de p3: "
                + l1.indexOf(p3));
    }
}
