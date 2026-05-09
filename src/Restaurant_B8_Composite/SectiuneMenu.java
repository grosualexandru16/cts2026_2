package Restaurant_B8_Composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMenu implements IOptiuneMeniu{

    private String nume;
    private List<IOptiuneMeniu> optiuni = new ArrayList<>();

    public SectiuneMenu(String nume) {
        this.nume = nume;
    }

    public void adaugaOptiune (IOptiuneMeniu optiune){

        optiuni.add(optiune);
    }







    @Override
    public void afiseaza() {
        System.out.println("Optiune: " + nume);
        for(IOptiuneMeniu o : optiuni){
            o.afiseaza();
        }

    }
}
