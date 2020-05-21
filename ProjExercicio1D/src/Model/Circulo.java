package Model;

public class Circulo {
    // Atributos
    public double raio;

    // Métodos
    public double calcularArea(){
        return Math.PI * Math.pow(this.raio,2); // Pierre quadrado, rs
    }
    public double calcularPerimetro(){
        return (2 * Math.PI) * this.raio;
    }
}
