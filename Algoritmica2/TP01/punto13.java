import java.util.Random;
import java.util.Scanner;

/*public class punto13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int veces, res, cont1, cont2, cont3, cont4, cont5, cont6;
        int[] dado = { 1, 2, 3, 4, 5, 6 };
        cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
        System.out.println("Cuantas veces deseas tirar los dados? ");
        veces = input.nextInt();
        for (int i = 0; i < veces; i++) {
            res = dado[rand.nextInt(6)];
            if (res == 1)
                cont1++;
            if (res == 2)
                cont2++;
            if (res == 3)
                cont3++;
            if (res == 4)
                cont4++;
            if (res == 5)
                cont5++;
            if (res == 6)
                cont6++;
        }
        System.out.print(
                "Num.:    Veces obtenidos:\n" + "1         " + cont1 + "\n2         " + cont2 + "\n3         " + cont3
                        + "\n4         " + cont4 + "\n5         " + cont5 + "\n6         " + cont6);
        input.close();
    }
}*/

public class punto13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int veces, res;
        int[] frecuencia = new int[6];
        System.out.println("Cuantas veces deseas tirar los dados? ");
        veces = input.nextInt();
        for (int i = 0; i < veces; i++) {
            res = rand.nextInt(6);
            frecuencia[res]++;
        }
        System.out.println("Num.:    Veces obtenidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "         " + frecuencia[i]);
        }
        input.close();
    }
}

/*
 * La variable frecuencia es un array de enteros con 6 elementos, uno para cada
 * número en un dado. Durante el ciclo for, se genera un número aleatorio del 0
 * al 5 y se utiliza como índice para incrementar el elemento correspondiente en
 * el array frecuencia. Después del ciclo, se recorre el array frecuencia para
 * mostrar la frecuencia de cada número.
 */