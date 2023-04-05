package operaciones;

public class Complejo {
    private float parteReal;
    private float parteImaginaria;

    public Complejo(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    /*
     * Este constructor recibe dos parámetros de tipo float, que son asignados a los
     * atributos parteReal y parteImaginaria del objeto creado. De esta forma, se
     * puede inicializar un objeto de la clase Complejo al momento de su creación,
     * como se muestra en el siguiente ejemplo:
     * 
     * Complejo c1 = new Complejo(3.0f, 4.0f);
     * Complejo c2 = new Complejo(-2.5f, 1.5f);
     * 
     * En este ejemplo, se están creando dos objetos de la clase Complejo, c1 y c2,
     * que se inicializan con los valores de parte real e imaginaria proporcionados
     * como parámetros al constructor.
     */

    public float getParteReal() {
        return parteReal;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo sumar(Complejo punto) {
        float real = this.parteReal + punto.getParteReal();
        float imaginario = this.parteImaginaria + punto.getParteImaginaria();
        return new Complejo(real, imaginario);
    }

    public Complejo restar(Complejo punto) {
        float real = this.parteReal - punto.getParteReal();
        float imaginario = this.parteImaginaria - punto.getParteImaginaria();
        return new Complejo(real, imaginario);
    }

    public Complejo multiplicar(Complejo punto) {
        float real = this.parteReal * punto.getParteReal();
        float imaginario = this.parteImaginaria * punto.getParteImaginaria();
        return new Complejo(real, imaginario);
    }

    public String toString() {
        return "(" + parteReal + " + " + parteImaginaria + "i)";
    }
}

/*
 * En esta implementación, la clase Complejo tiene dos variables privadas de
 * punto flotante (parteReal y parteImaginaria) que representan las partes real
 * e imaginaria del número complejo, respectivamente.
 * 
 * También se proporcionan métodos para obtener y establecer los valores de
 * estas variables (getParteReal, setParteReal, getParteImaginaria, y
 * setParteImaginaria).
 * 
 * Además, se implementan métodos para realizar las operaciones de suma, resta y
 * multiplicación de números complejos (suma, resta, y multiplicacion).
 * Estos métodos toman un objeto Complejo como parámetro y devuelven un nuevo
 * objeto Complejo que contiene el resultado de la operación.
 * 
 * Por último, se proporciona un método toString que devuelve una cadena que
 * representa el número complejo en la forma estándar
 * "parteReal + parteImaginaria i". Este método se utiliza para imprimir el
 * objeto Complejo en la forma estándar en la consola o en cualquier otro lugar
 * donde se necesite una representación
 */