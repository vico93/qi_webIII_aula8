package View;

import java.util.Scanner;

import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Aluno a1 = new Aluno();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do aluno: ");
        a1.setNome(entrada.nextLine());

        System.out.print("Digite a primeira nota de " + a1.getNome() + ": ");
        a1.setNota1(entrada.nextDouble());

        System.out.print("Digite a segunda nota de " + a1.getNome() + ": ");
        a1.setNota2(entrada.nextDouble());

        System.out.print("Digite a terceira nota de " + a1.getNome() + ": ");
        a1.setNota3(entrada.nextDouble());

        // Invoca os métodos e mostra resultados
        System.out.println(a1);
        System.out.println("Média do trimestre de " + a1.getNome() + ": " + String.format("%.2f", a1.calcularMedia()));
    }
}
