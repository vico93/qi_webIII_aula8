package Model;

public class Produto {
    // Atributos
    public String nome;
    public double valor;
    public int quantidade;

    // Métodos
    public double calcularTotalPagar(){
        return this.valor * this.quantidade;
    }
    public double calcularTotalComDesconto(){
        return this.calcularTotalPagar() * 0.78; // 100% - 22% = 78% do valor total
    }
    public double calcularTotalComJuros(){
        return this.calcularTotalPagar() * 1.35; // 100% + 35% = 135% do valor total
    }

    // toString
    @Override
    public String toString() {
        return "Nome do Produto: " + nome +
                "\nValor Unitário: R$ " + String.format("%.2f", valor) +
                "\nQuantidade: " + quantidade;
    }
}
