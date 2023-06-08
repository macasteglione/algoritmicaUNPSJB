import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioMap {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        lista1.add("caca");
        lista1.add("caca");
        lista1.add("pedro");
        
        lista2.add("caca");
        lista2.add("qsy");
        lista2.add("pedro");
        System.out.println("Las listas son similares? " + similar(lista1, lista2));
    }

    public static boolean similar(List<String> l, List<String> s) {
        if (l.size() != s.size())
            return false;
        Map<String, Integer> conteo1 = new HashMap<>();
        Map<String, Integer> conteo2 = new HashMap<>();
        for (String elem : l)
            conteo1.put(elem, conteo1.getOrDefault(conteo2, 0) + 1);
        for (String elem : s)
            conteo2.put(elem, conteo2.getOrDefault(conteo2, 0) + 1);
        for (Map.Entry<String, Integer> entrada : conteo1.entrySet())
            if (!conteo2.containsKey(entrada.getKey()) || conteo2.get(entrada.getKey()) != entrada.getValue())
                return false;
        return true;
    }
}
