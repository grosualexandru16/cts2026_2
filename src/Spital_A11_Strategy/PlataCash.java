package Spital_A11_Strategy;

public class PlataCash implements ISpital{


    @Override
    public void plateste(double suma) {
        System.out.println("S-a efecutat cu cash plata sumei de: " +suma);
    }
}
