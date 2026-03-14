package CTS_Prototype_1;

public class Rezervare implements CRezervare {

    String nume;
    int numarMasa;
    int telefon;
    TipMasa tipMasa;

    public Rezervare(String nume, int numarMasa, int telefon, TipMasa tipMasa) {

        if(nume.contains("Ion")){
            throw new IllegalArgumentException();
        }
        this.nume = nume;
        if (numarMasa > 30 || numarMasa < 1){
            throw new IllegalArgumentException();
        }
        this.numarMasa = numarMasa;
        this.telefon = telefon;
        this.tipMasa = tipMasa;
    }

    public Rezervare() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public TipMasa getTipMasa() {
        return tipMasa;
    }

    public void setTipMasa(TipMasa tipMasa) {
        this.tipMasa = tipMasa;
    }

    @Override
    public CRezervare clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.numarMasa = this.numarMasa;
        rezervare.telefon = this.telefon;
        rezervare.tipMasa = this.tipMasa;

        return rezervare;


    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", numarMasa=" + numarMasa +
                ", telefon=" + telefon +
                ", tipMasa=" + tipMasa +
                '}';
    }
}
