import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencias {
    public static void main(String[] args) {
        String wr[] = { "while", "for", "if", "for", "static", "while", "public" };
        TreeMap<Integer, List<String>> frec = wordFrec(wr);
        for (Map.Entry<Integer, List<String>> entrada : frec.entrySet())
            System.out.println("Frecuencia: " + entrada.getKey() + ", Palabras: " + entrada.getValue());
    }

    public static TreeMap<Integer, List<String>> wordFrec(String[] palabras) {
        TreeMap<Integer, List<String>> frecuenciaMap = new TreeMap<>();
        HashMap<String, Integer> contadorPalabras = new HashMap<>();
        for (String palabra : palabras)
            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
        for (Map.Entry<String, Integer> entrada : contadorPalabras.entrySet()) {
            List<String> listaPalabras = frecuenciaMap.getOrDefault(entrada.getValue(), new ArrayList<>());
            listaPalabras.add(entrada.getKey());
            frecuenciaMap.put(entrada.getValue(), listaPalabras);
        }
        return frecuenciaMap;
    }
}
