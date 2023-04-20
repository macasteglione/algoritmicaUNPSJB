package logica;

public class Inscripto {

    Asistente asistente;
    Curso curso;
    private  int calificacion;

    public Inscripto(int calificacion, Curso curso, Asistente asistente) {
        this.calificacion = calificacion;
        this.curso = curso;
        this.asistente = asistente;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Inscripto [asistente=" + asistente + ", curso=" + curso + ", calificacion=" + calificacion + "]";
    }
}
