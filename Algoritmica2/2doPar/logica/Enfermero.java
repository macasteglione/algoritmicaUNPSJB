package logica;

public class Enfermero extends Personal {

    public Enfermero(int legajo, int antiguedad, String nombre, double basico) {
        super(legajo, antiguedad, nombre, basico);
    }

    @Override
    public double calcularSueldo() {
        return Personal.getBasico() + Personal.getBasico() * super.getAntiguedad() * 0.1;
    }
}
