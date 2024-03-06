package colectivo.app;

import colectivo.logic.SimuladorColectivos;

/**
 * Clase principal que inicia la aplicacion del simulador de colectivos.
 * 
 * @author Matias Casteglione
 */
public class Aplicacion {
    /**
     * Punto de entrada principal de la aplicacion.
     *
     * @param args los argumentos de la linea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        SimuladorColectivos simulador = new SimuladorColectivos();
        simulador.simularViajes();
    }
}