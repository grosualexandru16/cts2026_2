package Spital_A14_COR;

public class EmitereFisa implements Handler{

    private Handler next;


    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Pacient pacient) {

        System.out.println("S-a emis fisa de internare pentru pacientul" + pacient.getNume());

    }
}
