package Restaurant_R12_Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    private List<IClient> clienti = new ArrayList<>();


    @Override
    public void adaugaClient(IClient client) {
        clienti.add(client);
    }

    @Override
    public void stergeClient(IClient client) {
        clienti.remove(client);
    }

    @Override
    public void notificaClient(String mesaj) {
            for(IClient client : clienti){

                client.notificaClienti(mesaj);
            }
    }

    public void adaugaOfertaNoua(String mesaj){

        notificaClient("Oferta noua" +mesaj);
    }


}
