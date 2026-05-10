package Restaurant_R12_Observer;

public class Clienti implements IClient{

    private String nume;

    public Clienti(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaClienti(String mesaj) {
        System.out.println("Clientul" + nume + " a primit un mesaj" + mesaj);
    }
}
