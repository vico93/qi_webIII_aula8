package View;

import Model.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Retangulo r1 = new Retangulo();

        // Pede e lê cada dado - atributo
        System.out.print("Digite a base do retângulo: ");
        r1.base = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        r1.altura = entrada.nextDouble();

        // Invoca os métodos e mostra resultados
        System.out.println(r1);
        System.out.println("A área do retângulo é: " + String.format("%.2f", r1.calcularArea()));
    }
}
