package Spital_A14_COR;

public class DisponibilitateSalon implements Handler{

    private Handler next;

    @Override
    public void setNext(Handler next) {
            this.next = next;
    }

    @Override
    public void handle(Pacient pacient) {

        if(pacient.isDisponibilitateSalon()){

            System.out.println("Exista salon disponibil, continuam");
            if(next != null ){

                next.handle(pacient);
            }
        }

        else {

            System.out.println("Nu exista saloane disponibile");
        }

    }
}
