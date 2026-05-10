package Spital_A6_Facade;

public class Pacient {

    private String nume;
    private boolean esteGrav;


    public Pacient(String nume, boolean esteGrav) {
        this.nume = nume;
        this.esteGrav = esteGrav;
    }

    public boolean areStareGrava(){
        return esteGrav;
    }

    @Override
    public String toString() {
        return nume;
    }
}
