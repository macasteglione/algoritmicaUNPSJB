package operaciones;

public class CuentaCorriente extends CuentaBancaria {
    private double saldoNegativoMax;

    public CuentaCorriente(String numeroDeCuenta, Double saldo, Cliente titular, double saldoNegativoMax) {
        super(numeroDeCuenta, saldo, titular);
        this.saldoNegativoMax = saldoNegativoMax;
    }

    public void depositar(Double monto) {
        super.depositar(monto);
        System.out.println("Deposito exitoso. Saldo actual $" + saldo);
    }

    public void extraer(Double monto) {
        if (saldo + saldoNegativoMax >= monto) {
            super.extraer(monto);
            System.out.println("Extraccion exitoso. Saldo actual $" + saldo);
        } else
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
    }
}
