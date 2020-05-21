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
        c1.raio = entrada.nextInt();

        // Invoca os métodos e mostra resultados
        System.out.println("A área do círculo de raio " + c1.raio + " é igual a " + c1.calcularArea());
        System.out.println("O perímetro do círculo de raio " + c1.raio + " é igual a " + c1.calcularPerimetro());
    }
}
