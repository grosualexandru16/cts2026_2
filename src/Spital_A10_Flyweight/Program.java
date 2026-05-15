package Spital_A10_Flyweight;

public class Program {

    public static void main(String[] args){

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight p1 = factory.getPacient("Gogu", "07437", "Florilor");
        Flyweight p2 = factory.getPacient("Gigi", "07437", "Florilor");

        StareInternare s1 = new StareInternare(2, 2, 2);
        StareInternare s2 = new StareInternare(2, 2, 2);

        p1.afiseazaInternare(s1);
        p2.afiseazaInternare(s2);
    }


}
