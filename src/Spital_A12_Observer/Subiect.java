package Spital_A12_Observer;

public interface Subiect {

    public void abonareObserver(Observer observer);
    public void dezAbonareObserver(Observer observer);
    public void notificareObserver(String notificare);
}
