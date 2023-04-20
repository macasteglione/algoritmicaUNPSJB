public class Operaciones {
    public double fahrACels(double temp){
        return 5.0 / 9.0 * (temp - 32);
    }
    
    public double celsAFahr(double temp){
        return 9.0 / 5.0 * temp + 32;
    }
}