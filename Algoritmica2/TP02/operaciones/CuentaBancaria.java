package operaciones;

public class CuentaBancaria {
    protected Double saldo;
    protected String numeroDeCuenta;
    protected Cliente titular;

    public CuentaBancaria(String numeroDeCuenta, Double saldo, Cliente titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito exitoso. Saldo actual $" + saldo);
    }

    public void extraer(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Extraccion exitosa. Saldo actual $" + saldo);
        } else
            System.out.println("Saldo insuficiente. Saldo actual $" + saldo);
    }
}
