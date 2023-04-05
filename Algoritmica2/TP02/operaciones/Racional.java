package operaciones;

public class Racional {
    private int numerador, denominador;
    private static int cuenta = 0;

    public Racional(int numerador, int denominador) {
        if (denominador == 0)
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        int maximoComunDivisor = maximoComunDivisor(numerador, denominador);
        this.numerador = numerador / maximoComunDivisor;
        this.denominador = denominador / maximoComunDivisor;
        cuenta++;
    }

    public int GetNumerador() {
        return numerador;
    }

    public void SetNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int GetDenominador() {
        return denominador;
    }

    public void SetDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int GetCuenta() {
        return cuenta;
    }

    public Racional sumar(Racional otroNum) {
        int numerador = this.numerador * otroNum.GetDenominador() + otroNum.GetNumerador() * this.denominador;
        int denominador = this.denominador * otroNum.GetDenominador();
        return new Racional(numerador, denominador);
    }

    public Racional restar(Racional otroNum) {
        int numerador = this.numerador * otroNum.GetDenominador() - otroNum.GetNumerador() * this.denominador;
        int denominador = this.denominador * otroNum.GetDenominador();
        return new Racional(numerador, denominador);
    }

    public Racional multiplicar(Racional otroNum) {
        int numerador = this.numerador * otroNum.GetNumerador();
        int denominador = this.denominador * otroNum.GetDenominador();
        return new Racional(numerador, denominador);
    }

    public Racional dividir(Racional otroNum) {
        if (otroNum.GetDenominador() == 0)
            throw new ArithmeticException("No se puede dividir por cero");
        int numerador = this.numerador * otroNum.GetDenominador();
        int denominador = this.denominador * otroNum.GetNumerador();
        return new Racional(numerador, denominador);
    }

    public Racional potenciar(int exponente) {
        int numerador = (int) Math.pow(this.numerador, exponente);
        int denominador = (int) Math.pow(this.denominador, exponente);
        return new Racional(numerador, denominador);
    }

    public String toString() {
        if (denominador == 1)
            return Integer.toString(denominador);
        else
            return numerador + "/" + denominador;
    }

    private int maximoComunDivisor(int a, int b) {
        if (b == 0)
            return a;
        return maximoComunDivisor(b, a % b);
    }
}

/*
 * La clase Racional tiene dos campos privados numerador y denominador que
 * representan el numerador y denominador del número racional, respectivamente.
 * El constructor de la clase toma como argumentos el numerador y denominador
 * del número racional y asegura que el denominador no sea cero, y reduce la
 * fracción a su forma más simple.
 * 
 * La clase tiene cuatro métodos que realizan las operaciones aritméticas
 * básicas de suma, resta, multiplicación y división entre dos números
 * racionales. Estos métodos devuelven un nuevo objeto Racional que contiene el
 * resultado de la operación.
 * 
 * Además, la clase sobrescribe el método toString() para que el número racional
 * se imprima de forma legible.
 * 
 * Por último, la clase tiene un método privado gcd() que calcula el máximo
 * común divisor de dos números enteros, que se utiliza para reducir la fracción
 * a su forma más simple en el constructor.
 */