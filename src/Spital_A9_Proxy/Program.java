package Spital_A9_Proxy;

public class Program {

    public static void main(String[] args){

        Pacient p1 = new Pacient("Gogu", true);
        Pacient p2 = new Pacient("Gigi", false);

        ISpital spital = new Spital();
        ISpital internare = new Proxy(spital);


        internare.interneazaPacient(p1);
        internare.interneazaPacient(p2);


    }
}
