package Restaurant_B11_Strategy;

public class PlataCash implements ITipPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Clientul Plateste:" +suma + "cu cash.");
    }
}
