import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContadorDePalabras {
    public static void main(String[] args) {
        Map<String, Integer> palabrasReservadas = new HashMap<>();
        try (BufferedReader lector = new BufferedReader(new FileReader("./PruebaPalabras.java"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String palabras[] = linea.split("\\W+");
                for (String palabra : palabras)
                    if (esPalabraReservada(palabra))
                        palabrasReservadas.put(palabra, palabrasReservadas.getOrDefault(palabra, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entrada : palabrasReservadas.entrySet())
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
    }

    private static boolean esPalabraReservada(String palabra) {
        String palabrasReservadas[] = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
                "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
        for (String palabraReservada : palabrasReservadas)
            if (palabraReservada.equals(palabra))
                return true;
        return false;
    }
}
