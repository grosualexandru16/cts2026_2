package Restaurant_B8_Composite;

public class Program {

    public static void main (String[] args){

        // Optiuni:

        IOptiuneMeniu apaMinerala = new ItemMenu("Apa Minerala");
        IOptiuneMeniu apaPlata = new ItemMenu("Apa Plata");
        IOptiuneMeniu tiramisu = new ItemMenu("Tiramisu");
        IOptiuneMeniu cafea = new ItemMenu("Cafea");

        //Sectiuni:

        SectiuneMenu bauturi = new SectiuneMenu("Bauturi");
        SectiuneMenu deserturi = new SectiuneMenu("Deserturi");
        SectiuneMenu cafele = new SectiuneMenu("Cafele");

        bauturi.adaugaOptiune(apaMinerala);
        bauturi.adaugaOptiune(apaPlata);
        deserturi.adaugaOptiune(tiramisu);
        cafele.adaugaOptiune(cafea);

        //Menu:

        SectiuneMenu menu = new SectiuneMenu("Menu");
        menu.adaugaOptiune(bauturi);
        menu.adaugaOptiune(cafele);
        menu.adaugaOptiune(deserturi);

        menu.afiseaza();





    }
}
