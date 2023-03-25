import java.util.Scanner;

public class punto06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ahora escriba su apellido: ");
        String apellido = input.nextLine();
        System.out.println(nombre + " " + apellido);
        input.close();
    }
}
