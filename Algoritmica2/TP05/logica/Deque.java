package logica;

public interface Deque<E> {

    public int size();

    public boolean isEmpty();

    public void addFirst(E element);

    public void addLast(E element);

    public E removeFirst();

    public E removeLast();

    public E first();

    public E last();
}
