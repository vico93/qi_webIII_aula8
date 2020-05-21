package View;

import Model.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Carro corolla = new Carro();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o preço de custo do carro: ");
        corolla.custoFabrica = entrada.nextDouble();

        // Invoca os métodos e mostra resultados
        System.out.println("\n\n-----------------------------------------------------------");
        System.out.println(corolla);
        System.out.println("Total com impostos e lucro: R$ " + String.format("%.2f", corolla.calcularPrecoFinal()));
    }
}
