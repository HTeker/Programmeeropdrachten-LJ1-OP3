package Opdracht_12;

/**
 * Created by Halil Teker on 4/26/2017.
 */
public class DeurIsGesloten implements Toestand {
    Lift lift;

    public DeurIsGesloten(Lift lift){
        this.lift = lift;
    }

    @Override
    public void verdiepingInstellen(int verdieping) {
        System.out.println("Verdieping ingesteld op: " + Integer.toString(verdieping));
        lift.setGekozenVerdieping(verdieping);
        lift.setHuidigeToestand(lift.getInBeweging());
    }

    @Override
    public void openen() {
        System.out.println("Deur openen");
        //lift.openen();
        lift.setHuidigeToestand(lift.getDeurIsOpen());
    }

    @Override
    public void sluiten() {
        System.out.println("Geen effect");
    }

    @Override
    public void beweeg() {
        System.out.println("Niet toegestaan");
    }
}
