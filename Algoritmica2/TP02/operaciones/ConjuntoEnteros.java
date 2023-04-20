package operaciones;

import java.util.Arrays;

public class ConjuntoEnteros {
    private boolean[] conjunto;

    public ConjuntoEnteros() {
        conjunto = new boolean[101];
        for (int i = 0; i < conjunto.length; i++)
            conjunto[i] = false;
    }

    public void agregarEntero(int entero) {
        if (entero >= 0 && entero < conjunto.length)
            conjunto[entero] = true;
        else
            System.out.println("Tiene que ser un numero entre 0 y 100.");
    }

    public void eliminarEnetro(int entero) {
        if (entero >= 0 && entero < conjunto.length)
            conjunto[entero] = false;
        else
            System.out.println("Tiene que ser un numero entre 0 y 100.");
    }

    public boolean esIgualA(ConjuntoEnteros c1, ConjuntoEnteros c2) {
        for (int i = 0; i < conjunto.length; i++)
            if (c1.conjunto[i] == c2.conjunto[i])
                return true;
        return false;
    }

    public static ConjuntoEnteros union(ConjuntoEnteros c1, ConjuntoEnteros c2) {
        ConjuntoEnteros union = new ConjuntoEnteros();
        for (int i = 0; i < c1.conjunto.length; i++)
            if (c1.conjunto[i])
                union.agregarEntero(i);
        for (int i = 0; i < c2.conjunto.length; i++)
            if (c2.conjunto[i])
                union.agregarEntero(i);
        return union;
    }

    public static ConjuntoEnteros interseccion(ConjuntoEnteros c1, ConjuntoEnteros c2) {
        ConjuntoEnteros interseccion = new ConjuntoEnteros();
        for (int i = 0; i < c1.conjunto.length; i++)
            if (c1.conjunto[i] && c2.conjunto[i])
                interseccion.agregarEntero(i);
        return interseccion;
    }

    public static ConjuntoEnteros diferencia(ConjuntoEnteros c1, ConjuntoEnteros c2) {
        ConjuntoEnteros diferencia = new ConjuntoEnteros();
        for (int i = 0; i < c1.conjunto.length; i++)
            if (c1.conjunto[i] && !c2.conjunto[i])
                diferencia.agregarEntero(i);
        return diferencia;
    }

    @Override
    public String toString() {
        return "Conjunto = " + Arrays.toString(conjunto);
    }
}
