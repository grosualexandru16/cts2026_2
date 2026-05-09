package Restaurant_B7_Decorator;

public class Program {

    public static void main(String[] args){

        IPrintareFactura nota = new Factura(123);
        IPrintareFactura notaCuFelicitare = new DecoratorFelicitare(nota);


        notaCuFelicitare.printeaza();



    }
}
