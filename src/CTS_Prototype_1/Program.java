package CTS_Prototype_1;

public class Program {

    public static void main(String[] args) {

        System.out.printf("Hello and welcome to Prototype!");

        Rezervare r1 = new Rezervare("Marcel", 10, 0765432, TipMasa.douapers);
        Rezervare r2 = (Rezervare) r1.clone();

        System.out.println(r2);

        }
    }




