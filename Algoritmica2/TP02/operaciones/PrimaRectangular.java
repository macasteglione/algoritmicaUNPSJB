package operaciones;

public class PrimaRectangular extends FiguraTridimensional {

    public PrimaRectangular() {
        super(0, 0, 0);
    }

    public PrimaRectangular(double x, double y, double z, double base, double altura, double profundidad) {
        super(x, y, z);
        setAltura(altura);
        setBase(base);
        setProfundidad(profundidad);
    }

    public double area() {
        return areaPrismaRectangular();
    }

    public double perimetro() {
        return perimetroPrismaRectangular();
    }

    public double volumen() {
        return volumenPrismaRectangular();
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

    public double getProfundidad() {
        return super.getProfundidad();
    }

    public void setProfundidad(double profundidad) {
        super.setProfundidad(profundidad);
    }

    @Override
    public String toString() {
        return "Prisma Rectangular = " + super.toString() + "\nBase = " + getBase() + "\nAltura = " + getAltura()
                + "\nProfundidad = " + getProfundidad();
    }
}
