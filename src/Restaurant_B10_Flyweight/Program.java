package Restaurant_B10_Flyweight;

public class Program {

public static void main(String[] args){

    FlyweightFactory factory = new FlyweightFactory();

    IClient c1 = factory.getClient("Alex" , "07885566688", "alex@cc.com");
    IClient c2 = factory.getClient("Sergiu" , "0788554477", "sergiu@cc.com");
    IClient c3 = factory.getClient("Alex" , "07885566688", "alex@cc.com");

    DetaliiRezervare d1 = new DetaliiRezervare(2, 3, "18.30");
    DetaliiRezervare d2 = new DetaliiRezervare(7, 5, "19.30");

    c1.afiseazaDetaliiRezervare(d1);
    c2.afiseazaDetaliiRezervare(d2);
    c3.afiseazaDetaliiRezervare(d2);


}





}
