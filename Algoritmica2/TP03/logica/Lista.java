package logica;

import java.util.Arrays;

public class Lista<E> {
    private int cantidadElementos;
    private final int MAXELEM;
    private E[] elementos;

    @SuppressWarnings("unchecked")
    public Lista(int capacidadMaxima) {
        this.MAXELEM = capacidadMaxima;
        this.elementos = (E[]) new Object[capacidadMaxima];
        this.cantidadElementos = 0;
    }

    public void add(E e) throws IndexOutOfBoundsException {
        if (MAXELEM > cantidadElementos)
            elementos[cantidadElementos++] = e;
        else
            throw new IndexOutOfBoundsException("La lista esta llena, no se puede agregar mas elementos.");
    }

    public void add(int p, E e) throws IndexOutOfBoundsException {
        if (p > MAXELEM || p < 0)
            throw new IndexOutOfBoundsException("El indice esta fuera de rango");
        if (elementos[p] == null)
            cantidadElementos++;
        elementos[p] = e;
    }

    public E get(int p) throws IndexOutOfBoundsException {
        if (p > MAXELEM || p < 0)
            throw new IndexOutOfBoundsException("El indice esta fuera de rango");
        return elementos[p];
    }

    public E remove(E e) {
        for (int i = 0; i < MAXELEM; i++)
            if (elementos[i] != null && elementos[i].equals(e)) {
                E elementoEliminado = elementos[i];
                for (int j = i; j < MAXELEM - 1; j++)
                    elementos[j] = elementos[j + 1];
                elementos[MAXELEM - 1] = null;
                cantidadElementos--;
                return elementoEliminado;
            }
        return null;
    }

    public E removePos(int p) throws IndexOutOfBoundsException {
        if (p > MAXELEM || p < 0)
            throw new IndexOutOfBoundsException("El indice esta fuera de rango");
        for (int i = 0; i < MAXELEM; i++)
            if (elementos[i] != null && elementos[i].equals(elementos[p])) {
                E elementoEliminado = elementos[i];
                for (int j = i; j < MAXELEM - 1; j++)
                    elementos[j] = elementos[j + 1];
                elementos[MAXELEM - 1] = null;
                cantidadElementos--;
                return elementoEliminado;
            }
        return null;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public int getCapacidadMaxima() {
        return MAXELEM;
    }

    public String toString() {
        return "Lista = " + Arrays.toString(elementos);
    }
}
