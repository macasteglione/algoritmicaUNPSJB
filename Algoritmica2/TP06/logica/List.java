package logica;

public interface List<E> {
    
    public void clear();

    public boolean contains(E e);

    public int indexOf(E e);

    public int lastIndexOf(E e);

    public boolean remove(E e);
}
