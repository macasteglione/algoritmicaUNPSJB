import java.util.Scanner;
import logica.JuegoDeAdivinar;

public class punto20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int aAdivinar = JuegoDeAdivinar.generarNumero();
            System.out.print("Bienvenido al juego de adivinar el numero!\n");
            JuegoDeAdivinar.adivinarNumero(aAdivinar, input);
            System.out.print("Deseas jugar de nuevo? Para salir use 0. Para continuar usa cualquier tecla: ");
            input.nextLine();
            String menu = input.next();
            if (menu.equals("0"))
                break;
        }
        input.close();
    }
}
