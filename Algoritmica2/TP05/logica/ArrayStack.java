package logica;

import java.util.ArrayList;

public class ArrayStack<E> implements Stack<E> {

    private ArrayList<E> list;

    public ArrayStack() {
        list = new ArrayList<E>();
    }

    @Override
    public void push(E element) {
        list.add(element);
    }

    @Override
    public E pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(size() - 1);
    }

    @Override
    public E peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(size());
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