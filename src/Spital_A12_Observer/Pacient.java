package Spital_A12_Observer;

public class Pacient implements Observer{

    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String notificare) {

        System.out.println("Pacientul " + nume + "a primit notificarea: " + notificare);

    }
}
