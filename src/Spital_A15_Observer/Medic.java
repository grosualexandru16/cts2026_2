package Spital_A15_Observer;

public class Medic {


    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }


    public void interneaza(String pacient){

        System.out.println("Medicul " + nume + "interneaza pacientul " +pacient);
    }

    public void trateazaImediat(String pacient){

        System.out.println("Medicul " + nume + "trateaza imediat " +pacient);
    }
}
