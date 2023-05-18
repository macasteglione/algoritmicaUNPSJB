package logica;

public interface CircularQueue<E> {

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public E peek();

    public void enqueue(E element);

    public E dequeue();
}
