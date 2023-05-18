import logica.Lista;

public class PruebaLista {
    public static void main(String[] args) {
        Lista<Integer> l1 = new Lista<>(5);
        l1.add(1);
        System.out.println(l1.toString());
        l1.add(4);
        l1.add(9);
        l1.add(8);
        l1.add(4, 3);
        l1.add(0, 6);
        System.out.println(l1.toString());
        System.out.println(l1.get(0));
        l1.remove(1);
        System.out.println(l1.toString());
        l1.removePos(4);
        System.out.println(l1.toString());
        l1.removePos(0);
        System.out.println(l1.toString());
        l1.add(8);
        System.out.println(l1.toString());
        System.out.println(l1.getCantidadElementos());
    }
}
