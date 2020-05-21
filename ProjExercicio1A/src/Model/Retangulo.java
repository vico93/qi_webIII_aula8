package Model;

public class Retangulo {
    // Atributos
    public double altura;
    public double base;

    // Métodos
    public double calcularArea(){
        return this.base * this.altura;
    }

    // toString
    @Override
    public String toString() {
        return "Base: " + String.format("%.2f", base) +
                "\nAltura: " + String.format("%.2f", altura);
    }
}
