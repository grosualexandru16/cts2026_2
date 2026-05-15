package Spital_A14_COR;

public class AnalizaStare implements  Handler{

    private Handler next;

    @Override
    public void setNext(Handler next) {
            this.next = next;
    }

    @Override
    public void handle(Pacient pacient) {

        if(pacient.getGravitate() > 5){
            System.out.println("Pacientul " + pacient.getNume() + "are stare grava, se trece la pasul urmator");
            if(next != null){
                next.handle(pacient);

            }
        }
        else{
            System.out.println("Pacientul " +pacient.getNume() + "nu necesita internare");
        }



    }
}
