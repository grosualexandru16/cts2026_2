package Restaurant_B9_Proxy;

public class Program {

    public static void main(String[] args){

        IRezervare rezervare = new ProxyRezervare(new Rezervare());

        rezervare.rezervaMasa(5);
        rezervare.rezervaMasa(3);

    }
}
