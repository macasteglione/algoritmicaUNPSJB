package logica;

public abstract class Vehiculo {

    private int modelo;
    private String marca, patente;

    public Vehiculo(int modelo, String marca, String patente) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
    }

    public abstract double calcularAlquiler(int dias, int kms);

    @Override
    public String toString() {
        return "Vehiculo: [modelo=" + modelo + ", marca=" + marca + ", patente=" + patente + "]";
    }
}
