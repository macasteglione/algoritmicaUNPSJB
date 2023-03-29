import java.util.Arrays;
import java.util.Scanner;

/*public class punto19 {
    static int[] dist(int[] a, int[] b) {
        int[] dist = { Math.abs(a[0] - b[0]), Math.abs(a[1] - b[1]) };
        return dist;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el valor x y desp. y: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Ahora ingrese el segundo valor de x y desp. y: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int[] punto1 = { x1, y1 };
        int[] punto2 = { x2, y2 };
        int[] res = dist(punto1, punto2);
        System.out.println("La distancia entre " + Arrays.toString(punto1) + " y " + Arrays.toString(punto2) + " es "
                + Arrays.toString(res));
        input.close();
    }
}*/

public class punto19 {
    static int[] dist(int[] a, int[] b) {
        int[] dist = { Math.abs(a[0] - b[0]), Math.abs(a[1] - b[1]) };
        return dist;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el valor x y desp. y del primer punto: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Ingresa el valor x y desp. y del segundo punto: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int[] punto1 = { x1, y1 };
        int[] punto2 = { x2, y2 };
        int[] res = dist(punto1, punto2);
        System.out.printf("La distancia entre %s y %s es (%d, %d)\n",
                Arrays.toString(punto1), Arrays.toString(punto2), res[0], res[1]);
        input.close();
    }
}

/*
 * El código parece estar bien estructurado y no hay redundancias ni operaciones
 * innecesarias. Sin embargo, podrías mejorar la legibilidad de las salidas
 * utilizando String.format() y cambiando el formato de los arreglos a un
 * formato más legible.
 */
