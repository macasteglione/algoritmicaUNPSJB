package operaciones;

public class Figura {
    private double radio, base, altura, profundidad;
    private Punto puntoOrigen;

    // Constructor
    public Figura(double x, double y, double z) {
        puntoOrigen = new Punto(x, y, z);
    }

    // Cuentitas
    public double diametroCirculo() {
        return 2 * radio;
    }

    public double areaCirculo() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double areaRectangulo() {
        return base * altura;
    }

    public double areaEsfera() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double areaPrismaRectangular() {
        return 2 * (base * profundidad + areaRectangulo() + profundidad * altura);
    }

    public double perimetroCirculo() {
        return diametroCirculo() * Math.PI;
    }

    public double perimetroRectangulo() {
        return 2 * (base + altura);
    }

    public double perimetroEsfera() {
        return perimetroCirculo();
    }

    public double perimetroPrismaRectangular() {
        return 4 * (base + altura + profundidad);
    }

    public double volumenEsfera() {
        return (4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    public double volumenPrismaRectangular() {
        return altura * base * profundidad;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0)
            this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0)
            this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        if (profundidad > 0)
            this.profundidad = profundidad;
    }

    // toStrings
    public String toString2d() {
        return "(" + puntoOrigen.getX() + ", " + puntoOrigen.getY() + ")";
    }

    public String toString3d() {
        return puntoOrigen.toString();
    }
}
