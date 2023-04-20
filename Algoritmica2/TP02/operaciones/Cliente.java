package operaciones;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre, direccion, email, cuit;
    private List<CuentaBancaria> cuentas;

    public Cliente(String nombre, String direccion, String email, String cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.cuit = cuit;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getCuit() {
        return cuit;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(CuentaBancaria cuenta) {
        cuentas.remove(cuenta);
    }

    public double getSaldoTotalCuentas() {
        double saldoTotal = 0;
        for (CuentaBancaria cuenta : cuentas)
            saldoTotal += cuenta.getSaldo();
        return saldoTotal;
    }
}
