import java.text.ParseException;

import operaciones.Fecha;

public class punto04 {
    public static void main(String[] args) throws ParseException {
        Fecha miFecha = new Fecha(2023, 11, 30);
        System.out.println(miFecha.toString());
        Fecha miOtraFecha = new Fecha(1220, 12, 3);
        System.out.println(miOtraFecha.toString());
        Fecha.mayorMenorOIgual(miFecha, miOtraFecha);
        Fecha.diferenciaDeFechas(miFecha, miOtraFecha);
        Fecha.diaDeSemana(miOtraFecha);
    }
}
