package Spital_A11_Strategy;

public class Pacient {

    private String nume;
    private ISpital tipPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setTipPlata(ISpital tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(double suma){

        if ( tipPlata == null){
            System.out.println("Nu s-a setat metoda de plata");


        }

        else{

            tipPlata.plateste(suma);
        }

    }
}
