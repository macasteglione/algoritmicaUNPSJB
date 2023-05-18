public class PruebaMetodosLista {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> l1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> l2 = new SinglyLinkedList<>();
        l1.addLast(11);
        l1.addLast(43);
        l1.addLast(66);
        l2.addLast(8);
        l2.addLast(73);
        l2.addLast(26);
        l1.addPos(55, 1);
        System.out.println(l1);
        System.out.println("Elemento eliminado: " + l1.removeElement(43));
        System.out.println(l1);
        l1.removePos(1);
        System.out.println(l1);
        l1.concatenate(l2);
        System.out.println(l1);
        System.out.println(l1.search(68));
        System.out.println("Son iguales las listas? " + l1.equals(l2));
    }
}
