package logica;

public class Moto extends Vehiculo {

    private double valorDia;

    public Moto(int modelo, String marca, String patente, double valorDia) {
        super(modelo, marca, patente);
        this.valorDia = valorDia;
    }

    @Override
    public double calcularAlquiler(int dias, int kms) {
        return valorDia * dias;
    }
}
