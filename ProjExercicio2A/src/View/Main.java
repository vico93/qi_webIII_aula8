package View;

// Imports globais
import java.util.Scanner;

// Imports locais
import Model.Calculo;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Calculo c1 = new Calculo();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o primeiro dos três números: ");
        c1.valor1 = entrada.nextDouble();

        System.out.print("Digite o segundo dos três números: ");
        c1.valor2 = entrada.nextDouble();

        System.out.print("Digite o terceiro e último dos três números: ");
        c1.valor3 = entrada.nextDouble();

        // Invoca os métodos e mostra resultados
        System.out.println("O produto dos valores é: " + c1.calcularProduto());

    }
}
