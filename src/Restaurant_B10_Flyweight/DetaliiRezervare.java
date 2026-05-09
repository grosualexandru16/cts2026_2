package Restaurant_B10_Flyweight;

public class DetaliiRezervare {

    private int numarMasa;
    private int numarPersoane;
    private String ora;


    public DetaliiRezervare(int numarMasa, int numarPersoane, String ora) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.ora = ora;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOra() {
        return ora;
    }
}
