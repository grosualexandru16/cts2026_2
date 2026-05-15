package Spital_A15_Observer;

public class ComandaTratareImediata implements Comanda{

    private Medic medic;
    private String pacient;

    public ComandaTratareImediata(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.trateazaImediat(pacient);
    }
}
