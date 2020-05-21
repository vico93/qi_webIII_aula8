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
        return this.calcularTotalPagar() * 0.91; // 100% - 9% = 91% do valor total
    }
    public double calcularTotalComJuros(){
        return this.calcularTotalPagar() * 1.25; // 100% + 25% = 125% do valor total
    }
}
