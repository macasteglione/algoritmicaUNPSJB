package operaciones;

abstract class FiguraBidimensional extends Figura {

    protected FiguraBidimensional(double x, double y) {
        super(x, y, 0.0);
    }

    protected double diametroCirculo() {
        return super.diametroCirculo();
    }

    protected String perimetroCirculo() {
        return super.perimetroCirculo();
    }

    protected double perimetroRectangulo() {
        return super.perimetroRectangulo();
    }

    protected String areaCirculo() {
        return super.areaCirculo();
    }

    protected double areaRectangulo() {
        return super.areaRectangulo();
    }

    @Override
    public String toString() {
        return toString2d();
    }
}
