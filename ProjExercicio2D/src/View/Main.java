package View;

// Imports globais
import java.util.Scanner;
// Imports locais
import Model.Vendedor;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Vendedor v1 = new Vendedor();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do Vendedor: ");
        v1.nome = entrada.nextLine();

        System.out.print("Digite o salário-base de " + v1.nome + ": ");
        v1.salarioBase = entrada.nextDouble();

        System.out.print("Digite o valor total das vendas efetuadas por " + v1.nome + ": ");
        v1.valorVendas = entrada.nextDouble();

        System.out.print("Digite o percentual de comissão que " + v1.nome + " recebe por venda (SEM o caracter '%'): ");
        v1.percentualComissao = entrada.nextDouble() / 100;

        // Invoca os métodos e mostra resultados
        System.out.println("\n\n-----------------------------------------------------------");
        System.out.println(v1);
        System.out.println("Valor da comissão: R$ " + String.format("%.2f", v1.calcularComissao()));
        System.out.println("Salário total: R$ " + String.format("%.2f", v1.calcularSalarioTotal()));
    }
}
