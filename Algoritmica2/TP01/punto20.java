import java.util.Random;
import java.util.Scanner;

public class punto20 {
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
}
