package logica;

public class Turno {

    private String fecha, hora;
    private Medico medico;
    private Paciente paciente;

    public Turno(String fecha, String hora, Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Turno [fecha=" + fecha + ", hora=" + hora + ", medico=" + medico + ", paciente=" + paciente + "]";
    }
}
