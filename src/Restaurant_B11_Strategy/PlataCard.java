package Restaurant_B11_Strategy;

public class PlataCard implements ITipPlata{




    @Override
    public void plateste(double suma) {
    System.out.println("Clientul Plateste:" +suma + "cu cardul.");
    }
}
