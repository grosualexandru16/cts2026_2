package Restaurant_B7_Decorator;

public class Decorator implements IPrintareFactura{

  protected IPrintareFactura nota;

    public Decorator(IPrintareFactura nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
}
