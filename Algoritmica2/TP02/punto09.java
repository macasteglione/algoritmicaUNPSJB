import operaciones.Circulo;
import operaciones.Esfera;
import operaciones.PrimaRectangular;
import operaciones.Rectangulo;

public class punto09 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10, 10, 10);
        System.out.println(circulo.toString() + "\nArea = " + circulo.area() + "\nDiametro = " + circulo.diametro()
                + "\nPerimetro = " + circulo.perimetro());

        Rectangulo rectangulo = new Rectangulo(20, 22, 14, 30);
        System.out.println(
                rectangulo.toString() + "\nArea = " + rectangulo.area() + "\nPerimetro = " + rectangulo.perimetro());

        Esfera esfera = new Esfera(30, 22, 12, 7);
        System.out.println(esfera.toString() + "\nVolumen = " + esfera.volumen() + "\nArea = " + esfera.area()
                + "\nPerimentro = " + esfera.perimetro());

        PrimaRectangular prismaRectangular = new PrimaRectangular(11.22, 75.1, 12.5, 88.98, 12.11, 22.2);
        System.out.println(prismaRectangular.toString() + "\nArea = " + prismaRectangular.area() + "\nPerimetro = "
                + prismaRectangular.perimetro() + "\nVolumen = " + prismaRectangular.volumen());
    }
}
