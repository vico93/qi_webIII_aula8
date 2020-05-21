package Model;

public class Conversor {
    // Atributos
    public int anos;

    // Métodos
    public int converterMeses(){
        return this.anos * 12;
    }
    public int converterSemanas(){
        return this.anos * 52;
    }
    public int converterDias(){
        return this.anos * 365;
    }
}
