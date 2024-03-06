package colectivo.model;

/**
 * Clase que representa a un pasajero de colectivo.
 * 
 * @author Matias Casteglione
 */
public class Pasajero {
    private Parada parada;
    private Parada paradaDestino;
    private int esperando = 0;

    /**
     * Constructor de la clase Pasajero.
     * 
     * @param parada        la parada de origen del pasajero
     * @param paradaDestino la parada de destino del pasajero
     */
    public Pasajero(Parada parada, Parada paradaDestino) {
        this.parada = parada;
        this.paradaDestino = paradaDestino;
    }

    /**
     * Obtiene la parada de origen del pasajero.
     * 
     * @return la parada de origen del pasajero
     */
    public Parada getParada() {
        return parada;
    }

    /**
     * Obtiene la parada de destino del pasajero.
     * 
     * @return la parada de destino del pasajero
     */
    public Parada getParadaDestino() {
        return paradaDestino;
    }

    /**
     * Establece la parada de destino del pasajero.
     * 
     * @param paradaDestino la parada de destino del pasajero
     */
    public void setParadaDestino(Parada paradaDestino) {
        this.paradaDestino = paradaDestino;
    }

    /**
     * Obtiene el tiempo que el pasajero ha estado esperando.
     * 
     * @return el tiempo que el pasajero ha estado esperando
     */
    public int getEsperando() {
        return esperando;
    }

    /**
     * Establece el tiempo que el pasajero ha estado esperando.
     * 
     * @param esperando el tiempo que el pasajero ha estado esperando
     */
    public void setEsperando(int esperando) {
        this.esperando = esperando;
    }

    @Override
    public String toString() {
        return "Pasajero [parada: " + parada.getId() + ", paradaDestino: " + paradaDestino.getId() + "]\n";
    }
}