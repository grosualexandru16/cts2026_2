package Spital_A9_Proxy;

public class Spital implements ISpital{
    @Override
    public void interneazaPacient(Pacient p) {
        System.out.println("Pacientul " + p.getName() + " a fost internat");
    }
}
