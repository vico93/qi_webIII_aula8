package Model;

public class Conversor {
    // Atributos
    private int anos;
    // Manipuladores dos atributos
    public int getAnos() {
        return anos;
    }
    public void setAnos(int anos) {
        this.anos = anos;
    }

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

    // toString
    @Override
    public String toString() {
        return "Nº de anos informados: " + anos;
    }
}
