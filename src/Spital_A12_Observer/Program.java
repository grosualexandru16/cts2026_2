package Spital_A12_Observer;

public class Program {

    public static void main(String[] args){


        Observer p1 = new Pacient("Gigi");
        Observer p2 = new Pacient("Marcu");

        Subiect s1 = new Spital();

        s1.abonareObserver(p1);
        s1.abonareObserver(p2);

        p1.notifica("Atentie virus nou");
        p2.notifica("Atentie virus nou");



    }




}
