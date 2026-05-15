package Spital_A10_Flyweight;

public class StareInternare {

    private int numarSalon;
    private int numarPat;
    private int numarZileInternare;


    public StareInternare(int numarSalon, int numarPat, int numarZileInternare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileInternare = numarZileInternare;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public int getNumarZileInternare() {
        return numarZileInternare;
    }
}
