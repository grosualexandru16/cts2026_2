package Restaurant_B9_Proxy;

public class Rezervare implements IRezervare{




    @Override
    public void rezervaMasa(int nrPersoane) {
        System.out.println("Rezervarea a fost efectuata pentru 4 persoane");
    }
}
