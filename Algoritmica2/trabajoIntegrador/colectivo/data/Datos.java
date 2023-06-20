package colectivo.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import colectivo.model.*;

public class Datos {
    public static List<Colectivo> cargarColectivos(String rutaArchivo) {
        List<Colectivo> colectivos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null)
                if (!linea.startsWith("#")) {
                    String[] partes = linea.split(";");
                    String idColectivo = partes[0];
                    Linea idLinea = new Linea(partes[1]);
                    int cantidadAsientos = Integer.parseInt(partes[2]);
                    int totalPasajeros = Integer.parseInt(partes[3]);
                    colectivos.add(new Colectivo(idColectivo, idLinea, cantidadAsientos, totalPasajeros));
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return colectivos;
    }

    public static List<Linea> cargarLineas(String rutaArchivoLinea, String rutaArchivoDireccion) {
        List<Linea> lineas = new ArrayList<>();
        Map<String, String> direccionMap = cargarDireccionMap(rutaArchivoDireccion);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoLinea))) {
            String linea;
            while ((linea = br.readLine()) != null)
                if (!linea.startsWith("#")) {
                    String[] partes = linea.split(";");
                    String idLinea = partes[0];
                    String[] paradaIds = partes[1].split(",");
                    Linea nuevaLinea = new Linea(idLinea);
                    for (String idParada : paradaIds) {
                        String direccion = direccionMap.getOrDefault(idParada, "");
                        Parada parada = new Parada(idParada, direccion);
                        nuevaLinea.agregarParada(parada);
                    }
                    lineas.add(nuevaLinea);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    public static Map<String, String> cargarDireccionMap(String rutaArchivo) {
        Map<String, String> direccionMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null)
                if (!linea.startsWith("#")) {
                    String[] partes = linea.split(";");
                    String idParada = partes[0];
                    String direccion = partes[1];
                    direccionMap.put(idParada, direccion);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return direccionMap;
    }

    public static List<Parada> cargarParadas(String rutaArchivo) {
        List<Parada> paradas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null)
                if (!linea.startsWith("#")) {
                    String[] partes = linea.split(";");
                    String idParada = partes[0];
                    String direccion = partes[1];
                    paradas.add(new Parada(idParada, direccion));
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paradas;
    }
}
