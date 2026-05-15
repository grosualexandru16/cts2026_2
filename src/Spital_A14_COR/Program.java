package Spital_A14_COR;

public class Program {

    public static void main(String[] args) {


        Handler analiza = new AnalizaStare();
        Handler disponibilitate = new DisponibilitateSalon();
        Handler emiter = new EmitereFisa();

        analiza.setNext(disponibilitate);
        disponibilitate.setNext(emiter);

        Pacient p1 = new Pacient("Gelu", 7, true);

        analiza.handle(p1);

    }
}
