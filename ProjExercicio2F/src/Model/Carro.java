package Model;

public class Carro {
    // Atributos
    public double custoFabrica;

    // Métodos
    public double calcularPrecoFinal(){
        return this.custoFabrica + (this.custoFabrica * 0.73); // 28% de percentual do distribuidor + 45% de impostos = 73% de percentual total.
    }

    // toString
    @Override
    public String toString() {
        return "Preço de custo do automóvel: R$ " + String.format("%.2f", custoFabrica);
    }
}
