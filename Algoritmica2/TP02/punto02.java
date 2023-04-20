import operaciones.Racional;

public class punto02{
    public static void main(String[] args) {
        Racional num1 = new Racional(12, 3);
        Racional num2 = new Racional(3, 2);
        Racional suma = num1.sumar(num2);
        System.out.println(suma.toString());
    }
}