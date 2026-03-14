package CTS_Factory_Restaurant_1;

public class FactoryRestaurant {


    public static Restaurant getProdus(TipSupa tipSupa) throws Exception {

        switch (tipSupa) {
            case Vita:
                return new SupaCiuperci();
            case Legume:
                return new SupaLegume();
            case Ciuperci:
                return new SupaCiuperci();
            default:
                throw new Exception("Supa nu exista");
        }


    }
}