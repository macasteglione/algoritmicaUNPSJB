package operaciones;

public class FiguraTridimensional extends Figura{

    public FiguraTridimensional(double x, double y, double z) {
        super(x, y, z);
    }

    public double areaEsfera() {
        return super.areaEsfera();
    }

    public double areaPrismaRectangular() {
        return super.areaPrismaRectangular();
    }

    public double perimetroEsfera() {
        return super.perimetroEsfera();
    }

    public double perimetroPrismaRectangular() {
        return super.perimetroPrismaRectangular();
    }

    public double volumenEsfera() {
        return super.volumenEsfera();
    }

    public double volumenPrismaRectangular() {
        return super.volumenPrismaRectangular();
    }

    @Override
    public String toString() {
        return super.toString3d();
    }
}
