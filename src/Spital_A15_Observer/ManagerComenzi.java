package Spital_A15_Observer;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {


    private List<Comanda> comenzi = new ArrayList<>();


    public void adaugaComanda(Comanda comanda){

        comenzi.add(comanda);

    }

    public void executaComenzi(){

        for(Comanda c : comenzi){

            c.executa();
        }

        comenzi.clear();
    }

}
