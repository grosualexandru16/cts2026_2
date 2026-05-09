package Restaurant_Adapter;

public class AdapterFactura implements IntSoftPrintare{

    SoftNouPrintare softNou = new SoftNouPrintare();

    public AdapterFactura(SoftNouPrintare softNou){
        this.softNou = softNou;
    }


    @Override
    public void PrinteazaFacture(double suma) {

        softNou.exportaBon(suma);

    }
}
