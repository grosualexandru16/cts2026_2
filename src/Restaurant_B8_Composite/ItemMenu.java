package Restaurant_B8_Composite;

public class ItemMenu implements IOptiuneMeniu{

    private String nume;

    public ItemMenu(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Item" + nume);

    }
}
