package Model;

public class Aluno {
    // Atributos
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    // Métodos
    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    // toString
    @Override
    public String toString() {
        return "Nome do Aluno: " + nome + "\nNota 1: " + String.format("%.2f", nota1) + "\nNota 2: " + String.format("%.2f", nota2) + "\nNota 3: " + String.format("%.2f", nota3);
    }
}
