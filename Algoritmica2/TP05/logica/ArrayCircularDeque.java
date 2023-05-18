package logica;

public class ArrayCircularDeque<E> implements Deque<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int front, rear, size;

    public ArrayCircularDeque() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayCircularDeque(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacidad inválida");
        data = (E[]) new Object[capacity];
        front = rear = size = 0;
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
    public void addFirst(E element) {
        if (size == data.length)
            resize();
        front = (front - 1 + data.length) % data.length;
        data[front] = element;
        size++;
    }

    @Override
    public void addLast(E element) {
        if (size == data.length)
            resize();
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;
        E element = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    @Override
    public E removeLast() {
        if (isEmpty())
            return null;
        rear = (rear - 1 + data.length) % data.length;
        E element = data[rear];
        data[rear] = null;
        size--;
        return element;
    }

    @Override
    public E first() {
        if (isEmpty())
            return null;
        return data[front];
    }

    @Override
    public E last() {
        if (isEmpty())
            return null;
        return data[(rear - 1 + data.length) % data.length];
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = data.length * 2;
        E[] newData = (E[]) new Object[newCapacity];
        int j = 0;
        for (int i = front; i != rear; i = (i + 1) % data.length)
            newData[j++] = data[i];
        data = newData;
        front = 0;
        rear = size;
    }
}
