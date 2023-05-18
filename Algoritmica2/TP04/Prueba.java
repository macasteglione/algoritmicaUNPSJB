import logica.*;
import java.util.Arrays;
import java.util.Random;

public class Prueba {

    private final static int SIZE = 7000;
    private final static int MAX = 20;

    public static void main(String[] args) {
        int[] numbers = new int[SIZE];
        int[] numbers1 = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
            numbers1[i] = numbers[i];
        }

        long startTime;
        long stopTime;
        long elapsedTime;

        startTime = System.nanoTime();
        Factorial sorter = new Factorial();
        sorter.sort(numbers1);
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("Compare Quicksort " + elapsedTime);

        startTime = System.nanoTime();
        Arrays.sort(numbers);
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("Compare Standard Java sort " + elapsedTime);
    }
}

/*
 * La complejidad del algoritmo, en el peor de los casos, es O(n^2),
 * aunque en promedio su complejidad es O(n log n).
 * 
 * Traza del algoritmo quicksort para ordenar el array {4, 2, 8, 7, 1, 9, 5}:
 * 
 * quicksort(0, 6)
 * pivot = 5
 * i = 0, j = 6
 * while (i <= j)
 * i = 0, j = 5
 * while (numbers[0] < pivot)
 * i = 1
 * while (numbers[5] > pivot)
 * j = 4
 * exchange(1, 4)
 * i = 2, j = 3
 * while (i <= j)
 * while (numbers[2] < pivot)
 * i = 3
 * while (numbers[3] > pivot)
 * j = 2
 * if (i <= j)
 * exchange(3, 2)
 * i = 4, j = 1
 * quicksort(0, 1)
 * pivot = 2
 * i = 0, j = 1
 * while (i <= j)
 * while (numbers[0] < pivot)
 * i = 1
 * while (numbers[1] > pivot)
 * j = 0
 * exchange(1, 0)
 * quicksort(0, 0)
 * quicksort(2, 1)
 * quicksort(3, 6)
 * pivot = 7
 * i = 3, j = 6
 * while (i <= j)
 * while (numbers[3] < pivot)
 * i = 4
 * while (numbers[6] > pivot)
 * j = 5
 * exchange(4, 5)
 * i = 5, j = 4
 * while (i <= j)
 * while (numbers[5] < pivot)
 * i = 6
 * while (numbers[4] > pivot)
 * j = 3
 * if (i <= j)
 * exchange(5, 4)
 * i = 6, j = 3
 * quicksort(3, 3)
 * quicksort(5, 6)
 * pivot = 9
 * i = 5, j = 6
 * while (i <= j)
 * while (numbers[5] < pivot)
 * i = 6
 * while (numbers[6] > pivot)
 * j = 5
 * exchange(6, 5)
 * quicksort(5, 5)
 * quicksort(7, 6)
 * 
 * El array ordenado resultante es {1, 2, 4, 5, 7, 8, 9}.
 */