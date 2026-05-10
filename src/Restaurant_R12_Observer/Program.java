package Restaurant_R12_Observer;

public class Program {

    public static void main(String[] args){

        Restaurant restaurant = new Restaurant();

        IClient c1 = new Clienti("Alex");
        IClient c2 = new Clienti("Maria");

        restaurant.adaugaClient(c1);
        restaurant.adaugaClient(c2);

        restaurant.adaugaOfertaNoua("2 Pizza la pret de 1");
        restaurant.adaugaOfertaNoua("Cola gratis in weekend");



    }
}
