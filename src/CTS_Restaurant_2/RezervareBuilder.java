package CTS_Restaurant_2;

public class RezervareBuilder implements Builder{


    boolean asezareGeam;
    boolean scaunErgonomic;
    boolean muzicaAmbientala;
    GenMuzica GenMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scaunErgonomic = false;
        this.muzicaAmbientala = false;
        this.GenMuzica = CTS_Restaurant_2.GenMuzica.Jazz;

    }

    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(GenMuzica muzicaAmbientala) {
        this.GenMuzica = muzicaAmbientala;
        return this;
    }



    @Override
    public Rezervare build() {
        return new Rezervare(asezareGeam, scaunErgonomic, muzicaAmbientala, GenMuzica);
    }


}
