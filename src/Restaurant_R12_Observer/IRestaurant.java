package Restaurant_R12_Observer;

public interface IRestaurant {

    public void adaugaClient(IClient client);
    public void stergeClient(IClient client);
    public void notificaClient(String mesaj);

}
