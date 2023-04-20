import logica.Asistente;
import logica.Inscripto;
import logica.Curso;

public class Prueba {
    public static void main(String[] args) {

        Asistente as1 = new Asistente("pepe", "123@123.com");
        Asistente as2 = new Asistente("carlo", "carlo@carlo.com");

        Inscripto ins[] = new Inscripto[3];

        ins[0] = new Inscripto(9, new Curso("caca", 1000), as1);
        ins[1] = new Inscripto(100, new Curso("pepe2", 10000), as2);
        ins[2] = new Inscripto(100, new Curso("Kaka", 990), as1);

        for (Inscripto miniIns : ins) {
            if (miniIns.getAsistente().equals("pepe"))
                System.out.println(miniIns.getCurso());
        }
    }
}