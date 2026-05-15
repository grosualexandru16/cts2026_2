package Spital_A15_Observer;

public class Program {


    public static void main(String[] args) {
        ManagerComenzi dispecer = new ManagerComenzi();

        Medic m1 = new Medic("Gabi");

        Comanda c1 = new ComandaInternare(m1, "Florin");
        Comanda c2 = new ComandaTratareImediata(m1, "Adrian");

        dispecer.adaugaComanda(c1);
        dispecer.adaugaComanda(c2);

        dispecer.executaComenzi();
    }
}
