/*public class punto16 {
    public static void main(String[] args) {
        double f = 4;
        for (int i = 3; i <= 50; i += 2)
            f = f - (4.0 / i) + (4.0 / i + 2);
        System.out.println(f);
    }
}*/

public class punto16 {
    public static void main(String[] args) {
        double pi = 4.0;
        for (int i = 3; i <= 50; i += 2) {
            pi = pi - 4.0 / i + 4.0 / (i + 2);
        }
        System.out.println(pi);
    }
}

/*
 * El código parece implementar una aproximación de la fórmula de Leibniz para
 * calcular el valor de pi. Sin embargo, hay un error en la expresión de la
 * fórmula, que debería ser f = f - 4.0 / i + 4.0 / (i + 2) en lugar de f = f -
 * (4.0 / i) + (4.0 / i + 2). Aquí está el código corregido y simplificado:
 */
