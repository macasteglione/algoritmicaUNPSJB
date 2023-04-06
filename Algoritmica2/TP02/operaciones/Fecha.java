package operaciones;

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

    public String mayorMenorOIgual(Fecha fecha1, Fecha fecha2) {
        int comparacion = fecha1.toString().compareTo(fecha2.toString());
        if (comparacion < 0)
            return fecha2 + " es mayor que " + fecha1;
        else if (comparacion > 0)
            return fecha1 + " es mayor que " + fecha2;
        else
            return fecha1 + " y " + fecha2 + " son iguales";
    }

    public String diferenciaDeFechas(Fecha fecha1, Fecha fecha2) {
        int diferencia = Integer.compare(fecha1.getAno(), fecha2.getAno());
        if (diferencia != 0)
            return "Hay " + Math.abs(diferencia) + " años de diferencia";
        diferencia = Integer.compare(fecha1.getMes(), fecha2.getMes());
        if (diferencia != 0)
            return "Hay " + Math.abs(diferencia) + " meses de diferencia";
        diferencia = Integer.compare(fecha1.getDia(), fecha2.getDia());
        return "Hay " + Math.abs(diferencia) + " dias de diferencia";
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
