package CTS_Restaurant_2;

public class Rezervare {


    boolean asezareGeam;
    boolean scaunErgonomic;
    boolean muzicaAmbientala;
    GenMuzica GenMuzica;

    public Rezervare(boolean scaunErgonomic, boolean asezareGeam, boolean muzicaAmbientala, GenMuzica genMuzica) {
        super();
        this.scaunErgonomic = scaunErgonomic;
        this.asezareGeam = asezareGeam;
        this.muzicaAmbientala = muzicaAmbientala;
        GenMuzica = genMuzica;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public GenMuzica getGenMuzica() {
        return GenMuzica;
    }

    public void setGenMuzica(GenMuzica genMuzica) {
        GenMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareGeam=" + asezareGeam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", GenMuzica='" + GenMuzica + '\'' +
                '}';
    }
}
