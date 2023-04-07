package operaciones;

import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Fecha {
    private int ano, mes, dia;

    public Fecha(int ano, int mes, int dia) {
        if (dia < 1 || dia > diasDelMes(ano, mes))
            throw new IllegalArgumentException("Tiene que ingresar un dia entre 1 y " + diasDelMes(ano, mes));
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Tiene que ingresar un mes entre 1 y 12.");
        if (ano < 0)
            throw new IllegalArgumentException("Tiene que ingresar un año positivo.");
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0)
            throw new IllegalArgumentException("Tiene que ingresar un año positivo.");
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Tiene que ingresar un mes entre 1 y 12.");
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > diasDelMes(ano, mes))
            throw new IllegalArgumentException("Tiene que ingresar un dia entre 1 y " + diasDelMes(ano, mes));
        this.dia = dia;
    }

    public Fecha diaSiguiente() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;
        dia++;
        if (dia > diasDelMes(ano, mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
        return new Fecha(ano, mes, dia);
    }

    public Fecha diaAnterior() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;
        dia--;
        if (dia == 0) {
            mes--;
            if (mes == 0) {
                mes = 12;
                ano--;
            }
            dia = diasDelMes(ano, mes);
        }
        return new Fecha(ano, mes, dia);
    }

    public static void mayorMenorOIgual(Fecha fecha1, Fecha fecha2) {
        int comparacion = fecha1.toString().compareTo(fecha2.toString());
        if (comparacion < 0)
            System.out.println(fecha2 + " es mayor que " + fecha1);
        else if (comparacion > 0)
            System.out.println(fecha1 + " es mayor que " + fecha2);
        else
            System.out.println(fecha1 + " y " + fecha2 + " son iguales");
    }

    public static void diferenciaDeFechas(Fecha fecha1, Fecha fecha2) throws ParseException {
        SimpleDateFormat fechaf = new SimpleDateFormat("yyyy/mm/dd");
        Date f1 = fechaf.parse(fecha1.toString());
        Date f2 = fechaf.parse(fecha2.toString());
        long tiempoTranscurrido = f2.getTime() - f1.getTime();
        TimeUnit unidad = TimeUnit.DAYS;
        long dias = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        System.out.println("Hay una diferencia de " + Math.abs(dias) + " dia(s)");
    }

    public static void diaDeSemana(Fecha fecha) {
        LocalDate fechaObtenida = LocalDate.of(fecha.getAno(), fecha.getMes(), fecha.getDia());
        String diaSemana = fechaObtenida.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("El dia de la semana para " + fecha.toString() + " es " + diaSemana);
    }

    private int diasDelMes(int ano, int mes) {
        int diasEnMes;
        switch (mes) {
            case 2:
                if (esBiciesto(ano))
                    diasEnMes = 29;
                else
                    diasEnMes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasEnMes = 30;
                break;
            default:
                diasEnMes = 31;
                break;
        }
        return diasEnMes;
    }

    private boolean esBiciesto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", ano, mes, dia);
    }
}
