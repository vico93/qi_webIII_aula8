package Model;

public class Vendedor {
    // Atributos
    public String nome;
    public double salarioBase;
    public double valorVendas;
    public double percentualComissao;

    // Métodos
    public double calcularComissao(){
        return this.valorVendas * this.percentualComissao;
    }
    public double calcularSalarioTotal(){
        return this.salarioBase + this.calcularComissao();
    }
}
