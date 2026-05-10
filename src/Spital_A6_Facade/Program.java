package Spital_A6_Facade;

public class Program {

    public static void main(String[] args){

        Pacient p1 = new Pacient("Ion", true);
        Pacient p2 = new Pacient("Marcel", false);
        Medic m1 = new Medic();
        Salon s1 = new Salon(2);


        FacadeSpital f = new FacadeSpital(m1, s1);

        f.interneazaPacient(p1);
        f.interneazaPacient(p2);





    }




}
