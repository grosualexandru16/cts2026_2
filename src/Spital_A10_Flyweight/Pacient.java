package Spital_A10_Flyweight;

public class Pacient implements Flyweight{

    private String nume;
    private String nrTel;
    private String adresa;

    public Pacient(String nume, String adresa, String nrTel) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTel = nrTel;
    }

    @Override
    public void afiseazaInternare(StareInternare stare) {
        System.out.println("Pacient" +nume + adresa +nrTel);
        System.out.println("Internare" + stare.getNumarPat() + stare.getNumarSalon() + stare.getNumarZileInternare());
    }
}
