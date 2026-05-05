package Restaurant_Facade;

public class Receptionist {

    private RestaurantFacade facade;

    Receptionist(RestaurantFacade facade){

        this.facade = facade;
    }

    public void verificareStatusMasaReceptionist (int nrMasa) {

        if (facade.verificareStatusMasa(nrMasa)) {
            System.out.println("Masa" + nrMasa + "poate fi ocupata");
        } else {

            System.out.println("Masa" + nrMasa + "nu poate fi ocupata");
        }

    }
}
