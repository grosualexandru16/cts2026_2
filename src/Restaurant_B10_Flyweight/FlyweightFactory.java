package Restaurant_B10_Flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, IClient> clienti = new HashMap<>();

    public IClient getClient(String nume, String telefon, String email){

        String key = nume + telefon + email;

        if (!clienti.containsKey(key)){

            clienti.put(key, new Client(nume, telefon, email));
        }



        return clienti.get(key);

    }



}
