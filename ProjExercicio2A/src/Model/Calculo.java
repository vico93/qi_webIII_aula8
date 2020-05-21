package Model;

public class Calculo {
    // Atributos
    public double valor1;
    public double valor2;
    public double valor3;

    // Métodos
    public double calcularProduto(){
        return this.valor1 * this.valor2 * this.valor3;
    }

    // toString
    @Override
    public String toString() {
        return "Valor 1: " + valor1 +
                "\nValor 2: " + valor2 +
                "\nValor 3: " + valor3;
    }
}
