package View;

import java.util.Scanner;

import Model.Circulo;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Circulo c1 = new Circulo();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o raio do círculo: ");
        c1.setRaio(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(c1);
        System.out.println("A área do círculo é igual a " + String.format("%.2f", c1.calcularArea()));
        System.out.println("O perímetro do círculo é igual a " + String.format("%.2f", c1.calcularPerimetro()));
    }
}
