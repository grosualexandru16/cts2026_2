package Spital_A6_Facade;

public class Salon {

    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public boolean arePaturiLibere(){

        return paturiLibere > 0;
    }

    public void ocupaPat(){
        paturiLibere--;
    }


}
