import operaciones.Fecha;

public class punto04 {
    public static void main(String[] args) {
        Fecha miFecha = new Fecha(2023, 11, 30);
        System.out.println(miFecha.toString());
        Fecha miOtraFecha = new Fecha(1220, 12, 3);
        System.out.println(miOtraFecha.toString());
        String diferencia = miFecha.mayorMenorOIgual(miFecha, miOtraFecha);
        System.out.println(diferencia);
        String diferenciaDeDias = miFecha.diferenciaDeFechas(miFecha, miOtraFecha);
        System.out.println(diferenciaDeDias);
    }
}
