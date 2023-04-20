package logica;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public boolean isEmpty() {
        return (primero != null);
    }

    public void add(Object data) {
        Nodo nuevo = new Nodo(data);
        if (isEmpty()) {
            nuevo.setSig(primero.getSig());
            primero.setSig(nuevo);
        }
        primero = nuevo;
    }

    public void show() {
        Nodo aux = primero;
        if (isEmpty()) {
            do {
                System.out.print(" " + aux.getDato());
                aux = aux.getSig();
            } while (aux != primero);
        }
    }
}
