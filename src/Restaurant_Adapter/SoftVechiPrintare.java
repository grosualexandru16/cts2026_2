package Restaurant_Adapter;

public class SoftVechiPrintare implements IntSoftPrintare{


    @Override
    public void PrinteazaFacture(double suma) {

        System.out.println("Clientul are de platit:" +suma + "Soft Vechi");

    }
}
