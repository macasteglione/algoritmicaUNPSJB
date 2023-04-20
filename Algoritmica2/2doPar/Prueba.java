import logica.*;

public class Prueba {
    public static void main(String[] args) {
        Medico m1 = new Medico(100, 3, "pedro", 2221);
        Medico m2 = new Medico(21, 1, "Jorge", 1124);

        Enfermero e1 = new Enfermero(33, 2, "Yani", 32244);
        Enfermero e2 = new Enfermero(325, 7, "Maria", 2244);
        Paciente p1 = new Paciente("caca", "3444344");
        Paciente p2 = new Paciente("caca2", "43434");

        Personal personal[] = new Personal[4];
        personal[0] = m1;
        personal[1] = m2;
        personal[2] = e1;
        personal[3] = e2;

        Turno turnos[] = new Turno[4];
        turnos[0] = new Turno("4/4/2000", "7:33", m2, p2);
        turnos[1] = new Turno("4/1/1112", "6:44", m1, p1);
        turnos[2] = new Turno("3/5/23423", "12:33", m2, p1);
        turnos[3] = new Turno("8/3/2312", "18:22", m1, p2);

        for (Personal miniP : personal)
            System.out.println("Sueldos: " + miniP.getNombre() + " $" + miniP.calcularSueldo());

        for (Turno turnito : turnos) 
            if (turnito.getMedico().equals(m1))
                System.out.println(turnito.getPaciente().getNombre());
    }
}