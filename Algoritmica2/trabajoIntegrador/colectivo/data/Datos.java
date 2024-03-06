package colectivo.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import colectivo.model.Colectivo;
import colectivo.model.Linea;
import colectivo.model.Parada;

/**
 * Clase encargada de cargar los datos del sistema desde archivos y proporcionar
 * acceso a ellos.
 * 
 * @author Matias Casteglione
 */
public class Datos {
    private List<Colectivo> colectivos;
    private List<Linea> lineas;
    private List<Parada> paradas;
    private int totalPasajeros;
    private int recorridos;

    /**
     * Constructor de la clase Datos.
     * Inicializa las listas de colectivos, líneas y paradas.
     */
    public Datos() {
        colectivos = new ArrayList<>();
        lineas = new ArrayList<>();
        paradas = new ArrayList<>();
    }

    /**
     * Carga la configuracion del sistema desde un archivo de propiedades.
     *
     * @param configFilePath la ruta del archivo de configuracion
     * @throws IOException si ocurre un error de lectura del archivo
     */
    public void cargarConfiguracion(String configFilePath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(configFilePath));
        String lineaFilePath = properties.getProperty("linea");
        String paradaFilePath = properties.getProperty("parada");
        String colectivoFilePath = properties.getProperty("colectivo");
        totalPasajeros = Integer.parseInt(properties.getProperty("pasajeros"));
        recorridos = Integer.parseInt(properties.getProperty("recorridos"));
        cargarLineas(lineaFilePath);
        cargarParadas(paradaFilePath);
        cargarLineas(lineaFilePath); // cargar las lineas nuevamente (tiempo muerto, problema de dependencias)
        lineas.removeIf(linea -> linea.getParadas().isEmpty()); // eliminar las lineas que no tienen paradas asociadas
        cargarColectivos(colectivoFilePath);
        cargarParadas(paradaFilePath); // cargar las paradas nuevamente (tiempo muerto, problema de dependencias)
        paradas.removeIf(parada -> parada.getLineas().isEmpty());
    }

    private void cargarLineas(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(";");
            String id = data[0];
            List<Parada> paradasPorLinea = new ArrayList<>();
            for (int i = 1; i < data.length; i++) {
                Parada parada = buscarParadaPorId(data[i]);
                if (parada != null) {
                    paradasPorLinea.add(parada);
                    parada.getLineas().add(buscarLineaPorId(id));
                }
            }
            Linea linea = new Linea(id, paradasPorLinea, new ArrayList<>());
            lineas.add(linea);
        }
        reader.close();
    }

    private void cargarParadas(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(";");
            String id = data[0];
            String direccion = data[1];
            Parada parada = new Parada(id, direccion, new ArrayList<>());
            paradas.add(parada);
        }
        reader.close();
    }

    private void cargarColectivos(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(";");
            String id = data[0];
            Linea lineaColectivo = buscarLineaPorId(data[1]);
            int asientos = Integer.parseInt(data[2]);
            int totalPasajeros = Integer.parseInt(data[3]);
            if (lineaColectivo != null) {
                Colectivo colectivo = new Colectivo(id, asientos, totalPasajeros, new ArrayList<>(), lineaColectivo);
                colectivos.add(colectivo);
                lineaColectivo.getColectivos().add(colectivo);
            }
        }
        reader.close();
    }

    private Linea buscarLineaPorId(String id) {
        for (Linea linea : lineas)
            if (linea.getId().equals(id))
                return linea;
        return null;
    }

    private Parada buscarParadaPorId(String id) {
        for (Parada parada : paradas)
            if (parada.getId().equals(id))
                return parada;
        return null;
    }

    /**
     * Obtiene la lista de colectivos cargados en el sistema.
     *
     * @return la lista de colectivos
     */
    public List<Colectivo> getColectivos() {
        return colectivos;
    }

    /**
     * Obtiene la lista de lineas cargadas en el sistema.
     *
     * @return la lista de lineas
     */
    public List<Linea> getLineas() {
        return lineas;
    }

    /**
     * Obtiene la lista de paradas cargadas en el sistema.
     *
     * @return la lista de paradas
     */
    public List<Parada> getParadas() {
        return paradas;
    }

    /**
     * Obtiene el numero total de pasajeros configurado en el sistema.
     *
     * @return el numero total de pasajeros
     */
    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    /**
     * Obtiene el numero de recorridos configurados en el sistema.
     *
     * @return el numero de recorridos
     */
    public int getRecorridos() {
        return recorridos;
    }
}