package Spital_A6_Facade;

public class FacadeSpital {

    private Medic medic;
    private Salon salon;

    public FacadeSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient p){

        if (p.areStareGrava() == false ){

            System.out.println("Pacientul poate fi tratat ambulator");
            return;
        }

        if (!medic.verificareMedic(p)){
            System.out.println("Pacientul poate fi tratat ambulator");
            return;
        }

        if (!salon.arePaturiLibere()){

            System.out.println("Nu exista paturi libere");
            return;
        }

        salon.ocupaPat();
        System.out.println("Pacientul " + p + " a fost internat." );



    }




}
