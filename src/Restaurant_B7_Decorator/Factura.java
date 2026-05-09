package Restaurant_B7_Decorator;

public class Factura implements IPrintareFactura{


    private double suma;

    public Factura(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
    System.out.println("Suma de plata este:" +suma);
    }
}
