package Restaurant_Facade;

public class Program {

    public static void main(String[] args){

        RestaurantFacade facade = new RestaurantFacade();
        Receptionist r = new Receptionist(facade);

        r.verificareStatusMasaReceptionist(3);


    }
}
