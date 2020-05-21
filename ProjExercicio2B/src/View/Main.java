package View;

// Imports Globais
import java.util.Scanner;
// Imports Locais
import Model.Produto;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Produto p1 = new Produto();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do produto: ");
        p1.nome = entrada.nextLine();

        System.out.print("Digite o valor unitário de " + p1.nome + ": ");
        p1.valor = entrada.nextDouble();

        System.out.print("Digite a quantidade de " + p1.nome + ": ");
        p1.quantidade = entrada.nextInt();

        // Invoca os métodos e mostra resultados
        System.out.println("\n\n-----------------------------------------------------------");
        System.out.println("Produto: " + p1.nome);
        System.out.println("Total à pagar: R$ " + p1.calcularTotalPagar());
        System.out.println("Total com desconto: R$ " + p1.calcularTotalComDesconto());
        System.out.println("Total com juros: R$ " + p1.calcularTotalComJuros());
    }
}
