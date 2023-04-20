package logica;

public class Alumno extends Universitario {
    
    private int matAprobada;

    public Alumno(String nombre, String email, String universidad, String carrera, int matAprobada) {
        super(nombre, email, universidad, carrera);
        this.matAprobada = matAprobada;
    }

    public int getMatAprobada() {
        return matAprobada;
    }

    public void setMatAprobada(int matAprobada) {
        this.matAprobada = matAprobada;
    }

    @Override
    public String toString() {
        return "Alumno [matAprobada=" + matAprobada + "]";
    }
}
