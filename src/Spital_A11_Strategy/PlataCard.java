package Spital_A11_Strategy;

public class PlataCard implements ISpital{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a platit cu cadrul suma de :" +suma);
    }
}
