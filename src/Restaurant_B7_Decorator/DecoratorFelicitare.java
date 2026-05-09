package Restaurant_B7_Decorator;

public class DecoratorFelicitare extends Decorator{


    public DecoratorFelicitare(IPrintareFactura nota) {
        super(nota);
    }


    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani cu sanatate!");
    }
}
