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
}
