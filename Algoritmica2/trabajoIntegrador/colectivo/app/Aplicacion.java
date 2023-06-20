package colectivo.app;

import colectivo.logica.Simulacion;
import colectivo.data.*;
import colectivo.model.*;
import java.util.List;
import java.util.Properties;

public class Aplicacion {
    public static void main(String[] args) {
        String rutaLinea = "linea.txt";
        String rutaParada = "parada.txt";
        String rutaColectivo = "colectivo.txt";
        String rutaConfig = "config.properties";
        List<Linea> lineas = Datos.cargarLineas(rutaLinea, rutaParada);
        List<Parada> paradas = Datos.cargarParadas(rutaParada);
        List<Colectivo> colectivos = Datos.cargarColectivos(rutaColectivo);
        Properties config = CargarConfig.cargarConfiguracion(rutaConfig);
        // Crear la simulación
        Simulacion simulacion = new Simulacion(lineas, paradas, colectivos, config);
        // Ejecutar la simulación
        simulacion.ejecutar();
    }
}