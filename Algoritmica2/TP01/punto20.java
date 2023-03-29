import java.util.Random;
import java.util.Scanner;

/*public class punto20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean run = true;
        while (run) {
            int aAdivinar = rand.nextInt(1000);
            int cont = 0;
            System.out.print("Bienvenido al juego de adivinar el numero!\nIngrese un numero: ");
            int num = input.nextInt();
            System.out.println(aAdivinar);
            while (num != aAdivinar) {
                if (num < aAdivinar)
                    System.out.println("Demasiado bajo");
                else
                    System.out.println("demasiado alto");
                cont++;
                System.out.print("Vuelve a intentar: ");
                num = input.nextInt();
            }
            System.out.print("Felicidades! Adivinaste el numero con " + cont
            + " intentos!\nDeseas jugar de nuevo? Para salir use 0. Para continuar usa cualquier tecla: ");
            String menu = input.nextLine();
            if (menu.equals("0"))
                run = false;
        }
        input.close();
    }
}*/

public class punto20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean run = true;
        while (run) {
            int aAdivinar = rand.nextInt(1000);
            int cont = 0;
            System.out.print("Bienvenido al juego de adivinar el numero!\n");
            int num;
            do {
                System.out.print("Ingrese un numero: ");
                num = input.nextInt();
                cont++;
                if (num < aAdivinar) {
                    System.out.println("Demasiado bajo");
                } else if (num > aAdivinar) {
                    System.out.println("Demasiado alto");
                }
            } while (num != aAdivinar);
            System.out.println("Felicidades! Adivinaste el numero con " + cont + " intentos!");
            System.out.print("Deseas jugar de nuevo? Para salir use 0. Para continuar usa cualquier tecla: ");
            String menu = input.next();
            if (menu.equals("0")) {
                run = false;
            }
        }
        input.close();
    }
}

/*
 * Los cambios que hice incluyen:
 * 
 * Reemplacé el segundo System.out.println(aAdivinar) con un do-while loop para
 * que el usuario pueda adivinar inmediatamente después de ingresar un número.
 * Usé un do-while loop en lugar de un while loop para asegurarme de que se
 * solicite al usuario que ingrese un número antes de verificar si es correcto o
 * no.
 * Usé un else if en lugar de un else para imprimir "Demasiado alto" en lugar de
 * "Demasiado bajo" si el número ingresado es mayor que el número a adivinar.
 * Usé input.next() en lugar de input.nextLine() para evitar problemas con
 * saltos de línea inesperados.
 * Agregué llaves para hacer el código más legible y consistente.
 */