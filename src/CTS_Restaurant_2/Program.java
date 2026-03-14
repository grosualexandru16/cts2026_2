package CTS_Restaurant_2;

public class Program {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome to Rezervation!");

        Rezervare r1 = new RezervareBuilder().setAsezareGeam(true).build();

        System.out.println(r1);




        }
    }

