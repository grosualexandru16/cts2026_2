package Spital_A14_COR;

public class Pacient {

    private  String nume;
    private int gravitate;
    private boolean disponibilitateSalon;

    public Pacient(String nume, int gravitate, boolean disponibilitateSalon) {
        this.nume = nume;
        this.gravitate = gravitate;
        this.disponibilitateSalon = disponibilitateSalon;
    }


    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public boolean isDisponibilitateSalon() {
        return disponibilitateSalon;
    }
}
