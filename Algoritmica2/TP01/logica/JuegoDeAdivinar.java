package logica;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinar {
    public static int generarNumero() {
        return new Random().nextInt(1000);
    }

    public static void adivinarNumero(int aAdivinar, Scanner input) {
        int intentos = 0;
        int numero;
        try {
            do {
                System.out.print("Ingrese un numero: ");
                numero = input.nextInt();
                if (numero < aAdivinar)
                    System.out.println("Demasiado bajo");
                else if (numero > aAdivinar)
                    System.out.println("Demasiado alto");
                intentos++;
            } while (numero != aAdivinar);
            System.out.println("Felicidades! Adivinaste el numero con " + intentos + " intentos!");
        } catch (Exception err) {
            System.out.println("Error: Tienes que ingresar un numero, no una letra >> " + err);
        }
    }
}
