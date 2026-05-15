package Spital_A11_Strategy;

public class Program {

    public static void main(String[] args){

        Pacient p1 = new Pacient("Gigel");
        Pacient p2 = new Pacient("Giani");
        Pacient p3 = new Pacient("Max");

        ISpital PlataCard = new PlataCard();
        ISpital PlataCash = new PlataCash();
        p1.setTipPlata(PlataCard);
        p2.setTipPlata(PlataCash);

        p1.plateste(300.5);
        p2.plateste(340.7);
        p3.plateste(400.5);


    }
}
