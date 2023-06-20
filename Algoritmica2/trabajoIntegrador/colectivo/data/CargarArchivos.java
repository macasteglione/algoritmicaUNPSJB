package colectivo.data;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import colectivo.model.*;

public class CargarArchivos {
    private static List<Linea> lineas;
    private static List<Parada> paradas;
    private static List<Colectivo> colectivos;
    private static Properties config;

    public static void cargar() throws IOException {
        String rutaLinea = "trabajoIntegrador/linea.txt";
        String rutaParada = "trabajoIntegrador/parada.txt";
        String rutaColectivo = "trabajoIntegrador/colectivo.txt";
        String rutaConfig = "trabajoIntegrador/config.properties";
        lineas = Datos.cargarLineas(rutaLinea, rutaParada);
        paradas = Datos.cargarParadas(rutaParada);
        colectivos = Datos.cargarColectivos(rutaColectivo);
        config = CargarConfig.cargarConfiguracion(rutaConfig);
    }

    public static List<Linea> getLineas() {
        return lineas;
    }

    public static List<Parada> getParadas() {
        return paradas;
    }

    public static List<Colectivo> getColectivos() {
        return colectivos;
    }

    public static Properties getConfig() {
        return config;
    }
}