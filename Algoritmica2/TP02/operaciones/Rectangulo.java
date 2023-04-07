package operaciones;

public class Rectangulo extends FiguraBidimensional {

    public Rectangulo() {
        super(0, 0);
    }

    public Rectangulo(double x, double y, double base, double altura) {
        super(x, y);
        setBase(base);
        setAltura(altura);
    }

    public double perimetro() {
        return perimetroRectangulo();
    }

    public double area() {
        return areaRectangulo();
    }

    public double getBase() {
        return super.getBase();
    }

    public void setBase(double base) {
        super.setBase(base);
    }

    public double getAltura() {
        return super.getAltura();
    }

    public void setAltura(double altura) {
        super.setAltura(altura);
    }

    @Override
    public String toString() {
        return "Rectangulo = " + super.toString() + "\nBase = " + getBase() + "\nAltura = " + getAltura();
    }
}