import logica.*;
import java.util.Arrays;
//import java.util.Random;

public class Prueba {

    //private final static int SIZE = 7000;
    //private final static int MAX = 20;

    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 7, 1, 9, 5};
        int[] numbers1 = {4, 2, 8, 7, 1, 9, 5};
        //Random generator = new Random();

        /*
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
            numbers1[i] = numbers[i];
        }*/

        long startTime, stopTime, elapsedTime;

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