package Spital_A5_Adapter;

public class Program {

    public static void main(String[] args){

        Medicament ms = new Medicament();

        Adapter ad = new Adapter(ms);


        ad.cumparaMedicament();



    }



}
