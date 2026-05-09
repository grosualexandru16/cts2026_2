package Restaurant_B13_COR;

public class AseazaServetele implements IHandlerMasa{
    private IHandlerMasa next;

    @Override
    public void setNext(IHandlerMasa next) {
        this.next = next;
    }

    @Override
    public void executa() {
        System.out.println("Se aseaza servetele....");
        if(next!= null) next.executa();
    }
}
