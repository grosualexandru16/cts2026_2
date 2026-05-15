package Spital_A8_Composite;

public class Program {


    public static void main(String[] args){


        Departament d1 = new Departament("Departament 1");

        Nod s1 = new Sectie("Sectia 1");
        Nod s2 = new Sectie("Sectia 2");

        d1.adaugaNod(s1);
        d1.adaugaNod(s2);

        d1.afisareDescriere();

    }




}
