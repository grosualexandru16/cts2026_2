package Restaurant_B11_Strategy;

public class Program {

    public static void main(String[] args){

        Client alex = new Client("Alex");

        alex.setTipPlata(new PlataCash());
        alex.platesteNota(256);

        alex.setTipPlata(new PlataCard());
        alex.platesteNota(289);



    }
}
