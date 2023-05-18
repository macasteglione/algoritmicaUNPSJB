package logica;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        elements = (E[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        if (size == elements.length)
            resize(elements.length * 2);
        elements[size] = e;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        E[] newElements = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
            newElements[i] = elements[i];
        elements = newElements;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (elements[i].equals(e))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--)
            if (elements[i].equals(e))
                return i;
        return -1;
    }

    @Override
    public boolean remove(E e) {
        int index = indexOf(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    private void remove(int index) {
        for (int i = index; i < size - 1; i++)
            elements[i] = elements[i + 1];
        elements[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}