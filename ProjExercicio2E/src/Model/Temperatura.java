package Model;

public class Temperatura {
    // Atributos
    public double celsius;

    // Métodos
    public double converterTemperatura(){
        return this.celsius * 1.8 + 32;
    }

    @Override
    public String toString() {
        return "Temperatura em Celsius: " + String.format("%.1f", celsius) +
                " °C";
    }
}
