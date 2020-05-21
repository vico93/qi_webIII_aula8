package View;

import java.util.Scanner;

import Model.Conversor;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Conversor c1 = new Conversor();

        // Pede e lê cada dado - atributo
        System.out.print("Digite a quantidade de anos: ");
        c1.anos = entrada.nextInt();

        // Invoca os métodos e mostra resultados
        System.out.println(c1.anos + " anos equivalem à: " + c1.converterMeses() + " meses, " + c1.converterSemanas() + " semanas ou " + c1.converterDias() + " dias!");
    }
}