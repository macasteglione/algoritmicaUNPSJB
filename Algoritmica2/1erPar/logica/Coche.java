package logica;

public class Coche extends Vehiculo {

    private int valorKm;

    public Coche(int modelo, String marca, String patente, int valorKm) {
        super(modelo, marca, patente);
        this.valorKm = valorKm;
    }

    @Override
    public double calcularAlquiler(int dias, int kms) {
        return valorKm * kms;
    }
}
