package logica;

public class Nodo {
    
    private Nodo sig;
    private Object dato;

    public Nodo(Object dato) {
        this.sig = this;
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
