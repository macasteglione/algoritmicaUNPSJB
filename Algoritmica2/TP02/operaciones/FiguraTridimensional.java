package operaciones;

abstract class FiguraTridimensional extends Figura {

    protected FiguraTridimensional(double x, double y, double z) {
        super(x, y, z);
    }

    protected String areaEsfera() {
        return super.areaEsfera();
    }

    protected double areaPrismaRectangular() {
        return super.areaPrismaRectangular();
    }

    protected String perimetroEsfera() {
        return super.perimetroEsfera();
    }

    protected double perimetroPrismaRectangular() {
        return super.perimetroPrismaRectangular();
    }

    protected String volumenEsfera() {
        return super.volumenEsfera();
    }

    protected double volumenPrismaRectangular() {
        return super.volumenPrismaRectangular();
    }

    @Override
    public String toString() {
        return super.toString3d();
    }
}
