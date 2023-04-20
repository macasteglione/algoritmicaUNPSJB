package operaciones;

abstract class Figura {
    private double radio, base, altura, profundidad;
    private Punto puntoOrigen;

    // Constructor
    protected Figura(double x, double y, double z) {
        puntoOrigen = new Punto(x, y, z);
    }

    // Cuentitas
    protected double diametroCirculo() {
        return 2 * radio;
    }

    protected String areaCirculo() {
        return String.format("%.2f", Math.PI * Math.pow(radio, 2));
    }

    protected double areaRectangulo() {
        return base * altura;
    }

    protected String areaEsfera() {
        return String.format("%.2f", 4 * Math.PI * Math.pow(radio, 2));
    }

    protected double areaPrismaRectangular() {
        return 2 * (base * profundidad + areaRectangulo() + profundidad * altura);
    }

    protected String perimetroCirculo() {
        return String.format("%.2f", diametroCirculo() * Math.PI);
    }

    protected double perimetroRectangulo() {
        return 2 * (base + altura);
    }

    protected String perimetroEsfera() {
        return perimetroCirculo();
    }

    protected double perimetroPrismaRectangular() {
        return 4 * (base + altura + profundidad);
    }

    protected String volumenEsfera() {
        return String.format("%.2f", (4 / 3) * Math.PI * Math.pow(radio, 3));
    }

    protected double volumenPrismaRectangular() {
        return altura * base * profundidad;
    }

    // Getters y Setters
    protected double getRadio() {
        return radio;
    }

    protected void setRadio(double radio) {
        if (radio > 0)
            this.radio = radio;
    }

    protected double getBase() {
        return base;
    }

    protected void setBase(double base) {
        if (base > 0)
            this.base = base;
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }

    protected double getProfundidad() {
        return profundidad;
    }

    protected void setProfundidad(double profundidad) {
        if (profundidad > 0)
            this.profundidad = profundidad;
    }

    // toStrings
    protected String toString2d() {
        return "(" + puntoOrigen.getX() + ", " + puntoOrigen.getY() + ")";
    }

    protected String toString3d() {
        return puntoOrigen.toString();
    }
}
