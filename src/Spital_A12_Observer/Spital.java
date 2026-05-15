package Spital_A12_Observer;

import java.util.ArrayList;

public class Spital implements Subiect{

    ArrayList<Observer> observatori  = new ArrayList();

    @Override
    public void abonareObserver(Observer observer) {
        observatori.add(observer);

    }

    @Override
    public void dezAbonareObserver(Observer observer) {
        observatori.remove(observer);
    }

    @Override
    public void notificareObserver(String notificare) {

        for (Observer obs : observatori){
            obs.notifica(notificare);
        }

    }
}
