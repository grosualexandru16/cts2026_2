package Spital_A8_Composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Nod{

    String nume;

    public Departament(String nume) {
        this.nume = nume;
    }

    List<Nod> departamente = new ArrayList<>();

    public void adaugaNod(Nod d){
        departamente.add(d);
    }

    public void stergeNod(Nod d) {

        departamente.remove(d);
    }

    public Nod getNodCopil(int index){
        return departamente.get(index);

    }


    @Override
    public void afisareDescriere() {

        System.out.println("Departament " + nume);

        for (Nod d : departamente){

           d.afisareDescriere();

        }

    }
}
