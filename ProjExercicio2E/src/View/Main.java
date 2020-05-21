package View;

import Model.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Temperatura t1 = new Temperatura();

        // Pede e lê cada dado - atributo
        System.out.print("Digite a temperatura em Celsius: ");
        t1.celsius = entrada.nextDouble();

        // Invoca os métodos e mostra resultados
        System.out.println("\n\n-----------------------------------------------------------");
        System.out.println("Temperatura em Fahrenheit: " + t1.converterTemperatura() + " °F");
    }
}
