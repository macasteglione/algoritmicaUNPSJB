package logica;

public class Medico extends Personal {

    public Medico(int legajo, int antiguedad, String nombre, double basico) {
        super(legajo, antiguedad, nombre, basico);
    }

    @Override
    public double calcularSueldo() {    
        return Personal.getBasico() * 1.5 + Personal.getBasico() * super.getAntiguedad() * 0.2;
    }
}
