package logica;

public class Persona extends Cliente {

    private static int porcJub = 50;
    private boolean jubilado;

    public Persona(int nroCliente, String nombre, Plan plan, int porcJub, Boolean jubilado) {
        super(nroCliente, nombre, plan);
        this.jubilado = jubilado;
    }

    @Override
    public double calcularFactura() {
        if (jubilado)
            return super.getPlan().getTarifa() * this.getPorcJub() / 100;
        return super.getPlan().getTarifa();
    }

    public int getPorcJub() {
        return porcJub;
    }

    public void setPorcJub(int porcJub) {
        Persona.porcJub = porcJub;
    }

    public boolean getJubilado() {
        return jubilado;
    }

    public void setJubilado(Boolean jubilado) {
        this.jubilado = jubilado;
    }

    @Override
    public String toString() {
        return "Persona [porcJub=" + porcJub + ", jubilado=" + jubilado + "]";
    }
}
