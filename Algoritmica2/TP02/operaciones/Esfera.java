package operaciones;

public class Esfera extends FiguraTridimensional {

    public Esfera() {
        super(0, 0, 0);
    }

    public Esfera(double x, double y, double z, double radio) {
        super(x, y, z);
        setRadio(radio);
    }

    public double area() {
        return areaEsfera();
    }

    public double perimetro() {
        return perimetroEsfera();
    }

    public double volumen() {
        return volumenEsfera();
    }

    public double getRadio() {
        return super.getRadio();
    }

    public void setRadio(double radio) {
        super.setRadio(radio);
    }

    @Override
    public String toString() {
        return "Centro = " + super.toString() + "\nRadio = " + getRadio();
    }
}
