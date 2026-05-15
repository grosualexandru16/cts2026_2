package Spital_A5_Adapter;

public class Adapter implements MedicamentFarmacie{

    Medicament medicamentSpital;

    public Adapter(Medicament medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {

        medicamentSpital.achizitioneazaMedicament();
    }
}
