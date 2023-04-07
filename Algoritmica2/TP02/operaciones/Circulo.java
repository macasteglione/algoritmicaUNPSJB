package operaciones;

public class Circulo extends FiguraBidimensional {

    public Circulo() {
        super(0, 0, 0);
    }

    public Circulo(double x, double y, double radio) {
        super(x, y, 0);
        setRadio(radio);
    }

    public double diametro() {
        return diametroCirculo();
    }

    public double perimetro() {
        return perimetroCirculo();
    }

    public double area() {
        return areaCirculo();
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
