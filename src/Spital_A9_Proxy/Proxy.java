package Spital_A9_Proxy;

public class Proxy implements ISpital{

   private ISpital s;

    public Proxy(ISpital s) {
        this.s = s;
    }



    @Override
    public void interneazaPacient(Pacient p) {

        if(p.isAreAsigurare()){
            s.interneazaPacient(p);
        }

        else{

            System.out.println("Pacientul nu are asigurare");
        }

    }
}
