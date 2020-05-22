package Model;

public class Retangulo {
    // Atributos
    private double altura;
    private double base;
    // Manipuladores de atributos
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

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
