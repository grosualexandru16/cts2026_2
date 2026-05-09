package Restaurant_B10_Flyweight;

public class Client implements IClient{

    private String nume;
    private String numarTelefon;
    private String email;


    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }


    @Override
    public void afiseazaDetaliiRezervare(DetaliiRezervare detaliiRezervare) {

        System.out.println("Clientul:" +nume +", cu telefon: " +numarTelefon + ", si email:" +email);
        System.out.println("Are masa: " + detaliiRezervare.getNumarMasa() + " cu numar persoane: " +detaliiRezervare.getNumarPersoane()
        + "la ora: " +detaliiRezervare.getOra());


    }
}
