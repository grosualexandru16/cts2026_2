package Spital_A10_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

private Map<String, Flyweight> pacienti = new HashMap<>();

public Flyweight getPacient(String nume, String nrTel, String adresa){

    String cheie = (nume+nrTel+adresa);

    if (!pacienti.containsKey(cheie)){

        pacienti.put(cheie, new Pacient (nume, nrTel, adresa));
    }

    return pacienti.get(cheie);


}





}
