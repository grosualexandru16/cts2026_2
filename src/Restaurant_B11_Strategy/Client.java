package Restaurant_B11_Strategy;

public class Client{
    private String nume;
    private ITipPlata tipPlata;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setTipPlata(ITipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void platesteNota(double suma){

        tipPlata.plateste(suma);
    }
}
