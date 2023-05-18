import logica.*;

public class PruebaQueue {
    public static void main(String[] args) {

        ArrayCircularQueue<Integer> q1 = new ArrayCircularQueue<>(5);

        q1.enqueue(44);
        q1.enqueue(5);
        q1.enqueue(522);
        q1.enqueue(123);
        q1.enqueue(67);

        System.out.println("Capacidad del queue: " + q1.size() + "\nEsta vacia? " + q1.isEmpty() + "\nEsta llena? "
                + q1.isFull() + "\nUltimo elemento del queue: " + q1.peek());
        System.out.println("Elementos eliminados: ");
        while (!q1.isEmpty())
            System.out.println(q1.dequeue());
        System.out.println("Capacidad del queue despues de eliminar los elementos: " + q1.size());
    }
}
