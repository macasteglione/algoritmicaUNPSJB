package logica;

public class ArrayCircularQueue<E> implements CircularQueue<E> {

    private E[] array;
    private int size, front, rear;

    @SuppressWarnings("unchecked")
    public ArrayCircularQueue(int capacity) {
        array = (E[]) new Object[capacity];
        size = front = rear = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }

    @Override
    public E peek() {
        if (isEmpty())
            throw new RuntimeException("La cola esta vacia");
        return array[front];
    }

    @Override
    public void enqueue(E element) {
        if (isFull())
            throw new RuntimeException("La cola esta llena");
        array[rear] = element;
        rear = (rear + 1) % array.length;
        size++;
    }

    @Override
    public E dequeue() {
        E element = peek();
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return element;
    }
}