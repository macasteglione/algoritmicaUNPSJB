import operaciones.ConjuntoEnteros;

public class punto06 {
    public static void main(String[] args) {
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();
        for (int i = 0; i < 6; i++)
        conjunto1.agregarEntero(i);
        for (int i = 4; i < 9; i++)
        conjunto2.agregarEntero(i);
        ConjuntoEnteros union = ConjuntoEnteros.union(conjunto1, conjunto2);
        ConjuntoEnteros interseccion = ConjuntoEnteros.interseccion(conjunto1, conjunto2);
        System.out.println(conjunto1.toString() + " --- " + conjunto2.toString());
        System.out.println(union.toString() + " --- " + interseccion.toString());
    }
}
