package Restaurant_B13_COR;

public class Program {

    public static void main(String[] args){

        IHandlerMasa h1 = new CurataMasa();
        IHandlerMasa h2 = new AseazaServetele();
        IHandlerMasa h3 = new AseazaTacamuri();
        IHandlerMasa h4 = new AseazaPersoane();

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);


        h1.executa();




    }
}
