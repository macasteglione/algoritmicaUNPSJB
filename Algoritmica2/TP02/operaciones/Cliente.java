package operaciones;

public class Cliente {
    private String nombre, direccion, email, cuit;

    public Cliente(String nombre, String direccion, String email, String cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.cuit = cuit;
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
}
