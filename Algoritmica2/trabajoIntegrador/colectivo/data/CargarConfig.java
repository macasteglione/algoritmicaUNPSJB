package colectivo.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CargarConfig {
    public static Properties cargarConfiguracion(String rutaArchivo) {
        Properties properties = new Properties();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}