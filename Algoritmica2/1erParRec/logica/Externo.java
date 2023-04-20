package logica;

public class Externo extends Asistente {

    private String empresa, profesion;

    public Externo(String nombre, String email, String empresa, String profesion) {
        super(nombre, email);
        this.empresa = empresa;
        this.profesion = profesion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Externo [empresa=" + empresa + ", profesion=" + profesion + "]";
    }
}