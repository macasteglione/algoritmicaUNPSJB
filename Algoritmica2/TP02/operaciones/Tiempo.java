package operaciones;

public class Tiempo {
    private int horas, minutos, segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        if (horas < 0 || horas > 23)
            throw new IllegalArgumentException("La hora tiene que ser entre 0 y 23");
        if (minutos < 0 || minutos > 59)
            throw new IllegalArgumentException("Los minutos tiene que ser entre 0 y 59");
        if (segundos < 0 || segundos > 59)
            throw new IllegalArgumentException("Los segundos tiene que ser entre 0 y 59");
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int GetHoras() {
        return horas;
    }

    public void SetHoras(int horas) {
        if (horas < 0 || horas > 23)
            throw new IllegalArgumentException("La hora tiene que ser entre 0 y 23");
        this.horas = horas;
    }

    public int GetMinutos() {
        return minutos;
    }

    public void SetMinutos(int minutos) {
        if (minutos < 0 || minutos > 59)
            throw new IllegalArgumentException("Los minutos tiene que ser entre 0 y 59");
        this.minutos = minutos;
    }

    public int GetSegundos() {
        return segundos;
    }

    public void SetSegundos(int segundos) {
        if (segundos < 0 || segundos > 59)
            throw new IllegalArgumentException("Los segundos tiene que ser entre 0 y 59");
        this.segundos = segundos;
    }

    public Tiempo incrementarSegundo() {
        int segundos = this.segundos;
        int minutos = this.minutos;
        int horas = this.horas;
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24)
                    horas = 0;
            }
        }
        return new Tiempo(horas, minutos, segundos);
    }

    public Tiempo incrementarMinuto() {
        int minutos = this.minutos;
        int horas = this.horas;
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            horas++;
            if (horas == 24)
                horas = 0;
        }
        return new Tiempo(horas, minutos, this.segundos);
    }

    public Tiempo incrementarHora() {
        int horas = this.horas;
        horas++;
        if (horas == 24)
            horas = 0;
        return new Tiempo(horas, this.minutos, this.segundos);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
