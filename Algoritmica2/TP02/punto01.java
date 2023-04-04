package Algoritmica2.TP02;

import operaciones.Complejo;

public class punto01 {
    public static void main(String[] args) {
        Complejo punto1 = new Complejo(11.0f, 23.0f);
        Complejo punto2 = new Complejo(9.0f, -2.0f);
        Complejo suma = punto1.sumar(punto2);
        System.out.println("El resultado es " + suma.toString());
    }
}
