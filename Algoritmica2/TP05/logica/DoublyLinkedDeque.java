package logica;

public class DoublyLinkedDeque<E> implements Deque<E> {
    
    private DoublyLinkedList<E> deque;

    public DoublyLinkedDeque() {
        deque = new DoublyLinkedList<>();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public E first() {
        return deque.first();
    }

    @Override
    public E last() {
        return deque.last();
    }

    @Override
    public void addFirst(E element) {
        deque.addFirst(element);
    }

    @Override
    public void addLast(E element) {
        deque.addLast(element);
    }

    @Override
    public E removeFirst() {
        return deque.removeFirst();
    }

    @Override
    public E removeLast() {
        return deque.removeLast();
    }
}
