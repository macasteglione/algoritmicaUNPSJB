package operaciones;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<CuentaBancaria> cuentas;

    public Banco() {
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public double saldoTotalDeClientes() {
        double sueldoTotal = 0;
        for (Cliente cliente : clientes)
            sueldoTotal += cliente.getSaldoTotalCuentas();
        return sueldoTotal;
    }

    public double saldoNegaticoTotalDeCuentas() {
        double sueldoTotal = 0;
        for (CuentaBancaria cuenta : cuentas)
            if (cuenta instanceof CuentaCorriente && cuenta.getSaldo() < 0)
                sueldoTotal += cuenta.getSaldo();
        return sueldoTotal;
    }

}
