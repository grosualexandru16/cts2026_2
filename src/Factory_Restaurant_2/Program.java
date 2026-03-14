package Factory_Restaurant_2;

public class Program {

    public static void main(String[] args){

        try {
            Supe s1 = new Factory().getProdus(TipSupa.Vita);
            s1.servesteSupa();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
