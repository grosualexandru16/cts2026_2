package Spital_A8_Composite;

public class Sectie implements Nod{

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Sectia" + nume);
    }
}
