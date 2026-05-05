package Restaurant_Facade;

public class RestaurantFacade {

    private VerificareMasaLibera verificareMasaLibera;
    private VerificareMasaDebarasata verificareMasaDebarasata;
    private VerificareMasaServetele verificareMasaServetele;

    RestaurantFacade(){
        this.verificareMasaDebarasata = new VerificareMasaDebarasata();
        this.verificareMasaLibera = new VerificareMasaLibera();
        this.verificareMasaServetele = new VerificareMasaServetele();

    }

    public boolean verificareStatusMasa(int nrMasa){

        boolean masaLibera = verificareMasaLibera.returnareVerificareMasaLibera(nrMasa);
        boolean masaDebarasata = verificareMasaDebarasata.returnareVerificareMasaDebarasata(nrMasa);
        boolean masaServetele = verificareMasaServetele.returnareVerirficareMasaServetele(nrMasa);

        return masaLibera && masaDebarasata && masaServetele;
    }


}
