import logica.*;

public class PruebaArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        l.add(5);
        l.add(2);
        l.add(8);
        l.add(5);
        l.add(10);

        System.out.println("Lista: " + l);

        System.out.println(
                "La lista contiene el número 8? " + l.contains(8) + "\nÍndice de la primera ocurrencia del número 5: "
                        + l.indexOf(5) + "\nÍndice de la última ocurrencia del número 5: "
                        + l.lastIndexOf(5));

        boolean removed = l.remove(2);
        System.out.println("¿Se eliminó el número 2 de la lista? " + removed + "\nLista después de eliminar el número: "
                + l);

        l.clear();
        System.out.println("Lista después de limpiarla: " + l);
    }
}
