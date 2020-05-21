package Model;

public class Temperatura {
    // Atributos
    public double celsius;

    // Métodos
    public double converterTemperatura(){
        return this.celsius * 1.8 + 32;
    }
}
