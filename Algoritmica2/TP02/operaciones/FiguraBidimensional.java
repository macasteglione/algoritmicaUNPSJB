package operaciones;

public class FiguraBidimensional extends Figura {

    public FiguraBidimensional(double x, double y, double z) {
        super(x, y, 0.0);
    }

    public double diametroCirculo() {
        return super.diametroCirculo();
    }

    public double perimetroCirculo() {
        return super.perimetroCirculo();
    }
    
    public double perimetroRectangulo() {
        return super.perimetroRectangulo();
    }
    
    public double areaCirculo() {
        return super.areaCirculo();
    }

    public double areaRectangulo() {
        return super.areaRectangulo();
    }

    @Override
    public String toString() {
        return toString2d();
    }
}
