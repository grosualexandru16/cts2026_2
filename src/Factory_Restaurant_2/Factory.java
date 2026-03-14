package Factory_Restaurant_2;

import Factory_Restaurant_2.TipSupa;

public class Factory {

    public static Supe getProdus(TipSupa tipSupa) throws Exception{

        switch(tipSupa){

            case Vita:
                return new SupaVita();

            case Legume :
                return new SupaLegume();

            case Ciuperci:
                return new SupaCiuperci();

            default:
                throw new Exception("Supa nu exista");




        }



    }



}
