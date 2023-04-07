package operaciones;

public class CajaAhorro extends CuentaBancaria {
    public CajaAhorro(String numeroDeCuenta, Double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }

    public void depositar(double monto) {
        if (monto >= 0) {
            super.depositar(monto);
            System.out.println("Deposito exitoso. Saldo actual $" + saldo);
        } else
            System.out.println("El monto debe ser mayor o igual a cero.");
    }

    public void extraer(double monto) {
        if (saldo >= monto && monto >= 0) {
            super.extraer(monto);
            System.out.println("Extraccion exitosa. Saldo actual $" + saldo);
        } else
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
    }
}