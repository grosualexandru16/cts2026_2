package Restaurant_Adapter;

public class Program {

    public static void main (String[] args){

        IntSoftPrintare bonVechi = new SoftVechiPrintare();
        bonVechi.PrinteazaFacture(50);

        SoftNouPrintare bonNou = new SoftNouPrintare();
        IntSoftPrintare adapter = new AdapterFactura(bonNou);

        adapter.PrinteazaFacture(70);


    }


}
