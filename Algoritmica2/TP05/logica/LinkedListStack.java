package logica;

public class LinkedListStack<E> implements Stack<E> {
    
    private SinglyLinkedList<E> list;

    public LinkedListStack() {
        list = new SinglyLinkedList<E>();
    }

    @Override
    public void push(E element) {
        list.addLast(element);
    }

    @Override
    public E pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeLast();
    }

    @Override
    public E peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.last();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
