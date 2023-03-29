import java.util.Scanner;

/*public class punto17 {
    static double hipo(double co, double ca) {
        double h = Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
        return h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la medida del cateto opuesto: ");
        double co = input.nextInt();
        System.out.print("Ahora ingrese la medida del cateto adyacente: ");
        double ca = input.nextInt();
        double h = hipo(co, ca);
        System.out.println("La hipotenusa es: " + (int) h);
        input.close();
    }
}*/

public class punto17 {
    double hipo(double co, double ca) {
        return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la medida del cateto opuesto: ");
        var co = input.nextDouble();
        System.out.print("Ahora ingrese la medida del cateto adyacente: ");
        var ca = input.nextDouble();
        var h = new punto17().hipo(co, ca);
        System.out.printf("La hipotenusa es: %.2f\n", h);
        input.close();
    }
}

/*
 * En lugar de declarar el método hipo como static, puede declarar los
 * parámetros co y ca como parámetros de la función hipo. Esto permitiría que el
 * método hipo sea una función de instancia, lo que puede ser útil en algunos
 * casos.
 * 
 * En lugar de imprimir la hipotenusa después de convertirla a un int, puede
 * usar printf para formatear la salida y mostrar la hipotenusa como un número
 * de coma flotante con solo dos decimales.
 * 
 * Puede usar var en lugar de double para declarar co, ca, y h en main(). Esto
 * hará que el código sea un poco más corto y legible.
 */