package logica;

public abstract class Personal {
    
    private int legajo, antiguedad;
    private String nombre;
    private static double basico = 10000;

    public Personal(int legajo, int antiguedad, String nombre, double basico) {
        this.legajo = legajo;
        this.antiguedad = antiguedad;
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double getBasico() {
        return basico;
    }

    public static void setBasico(double basico) {
        Personal.basico = basico;
    }
}
