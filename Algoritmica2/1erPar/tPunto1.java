import java.util.ArrayList;

public class tPunto1 {
    public static void main(String[] args) {

        System.out.println("----- Memoria estatica, usando un array comun -----");
        String aNombres[] = new String[5];

        aNombres[0] = "Pepe";
        aNombres[1] = "Maria";
        aNombres[2] = "Carlos";
        aNombres[3] = "Juan";
        aNombres[4] = "Luca";

        for (String mostrarNombre : aNombres)
            System.out.println(mostrarNombre);

        System.out.println("----- Memoria dinamica, usando un arrayList -----");
        ArrayList<String> dNombres = new ArrayList<>();

        dNombres.add("Vanesa");
        dNombres.add("Mariano");
        dNombres.add("Pedro");
        dNombres.add("Horacio");

        for (String mostrarNombre : dNombres)
            System.out.println(mostrarNombre);

        dNombres.remove(2);
        dNombres.remove(0);

        System.out.println("----- Ahora con elementos borrados, con arrayList -----");
        for (String mostrarNombre : dNombres)
            System.out.println(mostrarNombre);
    }
}
