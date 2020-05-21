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

    // toString

    @Override
    public String toString() {
        return "Nome do Vendedor: " + nome +
                "\nSalário-base: R$ " + String.format("%.2f", salarioBase) +
                "\nTotal angariado com vendas: R$ " + String.format("%.2f", valorVendas) +
                "\nPercentual de comissão: " + String.format("%.1f", (percentualComissao * 100)) +
                '%';
    }
}
