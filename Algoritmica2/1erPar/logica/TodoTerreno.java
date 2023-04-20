package logica;

public class TodoTerreno extends Vehiculo {

    private double valorDia, valorKm;

    public TodoTerreno(int modelo, String marca, String patente, double valorDia, double valorKm) {
        super(modelo, marca, patente);
        this.valorDia = valorDia;
        this.valorKm = valorKm;
    }

    @Override
    public double calcularAlquiler(int dias, int kms) {
        return (valorDia * dias) + (valorKm * kms);
    }
}
