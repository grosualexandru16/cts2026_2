package Spital_A14_COR;

public interface Handler {
    public void setNext(Handler next);
    public void handle(Pacient pacient);

}
