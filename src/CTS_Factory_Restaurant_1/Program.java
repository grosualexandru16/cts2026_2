package CTS_Factory_Restaurant_1;

public class Program {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        try {
            Restaurant r1 = FactoryRestaurant.getProdus(TipSupa.Legume);
            r1.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
