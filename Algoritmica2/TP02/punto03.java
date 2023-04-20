import operaciones.Tiempo;

public class punto03 {
    public static void main(String[] args) {
        Tiempo horarioDeTrabajo = new Tiempo(12, 59, 59);
        System.out.println(horarioDeTrabajo.toString());
        horarioDeTrabajo = horarioDeTrabajo.incrementarSegundo();
        System.out.println(horarioDeTrabajo.toString());
    }
}
