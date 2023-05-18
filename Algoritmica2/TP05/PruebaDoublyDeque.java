import logica.*;

public class PruebaDoublyDeque {
    public static void main(String[] args) {

        DoublyLinkedDeque<Integer> dq1 = new DoublyLinkedDeque<>();

        dq1.addFirst(1);
        dq1.addLast(2);
        dq1.addFirst(3);
        dq1.addLast(4);

        System.out.println("Capacidad: " + dq1.size() + "\nPrimer elemento: " + dq1.first() + "\nUltimo elemento: "
                + dq1.last());

        System.out.println("Eliminando el primer elemento: " + dq1.removeFirst() + "\nEliminando el ultimo elemento: "
                + dq1.removeLast());

        System.out.println("Capacidad: " + dq1.size() + "\nPrimer elemento: " + dq1.first() + "\nUltimo elemento: "
                + dq1.last());
    }
}