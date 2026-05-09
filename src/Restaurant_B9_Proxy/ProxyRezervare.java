package Restaurant_B9_Proxy;

public class ProxyRezervare implements IRezervare{

    Rezervare rezervare = new Rezervare();

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {

        if(nrPersoane > 4){
            rezervare.rezervaMasa(nrPersoane);
        }

        else {
            System.out.println("Rezervarea nu se poate face!");
        }

    }
}
