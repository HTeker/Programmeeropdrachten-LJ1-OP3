package Opdracht_12;

/**
 * Created by Halil Teker on 4/26/2017.
 */
public class DeurIsOpen implements Toestand {

    Lift lift;

    public DeurIsOpen(Lift lift){
        this.lift = lift;
    }

    @Override
    public void verdiepingInstellen(int verdieping) {
        System.out.println("Niet toegestaan");
    }

    @Override
    public void openen() {
        System.out.println("Geen effect");
    }

    @Override
    public void sluiten() {
        System.out.println("Deur sluiten");
        lift.setHuidigeToestand(lift.getDeurIsGesloten());
    }

    @Override
    public void beweeg() {
        System.out.println("Niet toegestaan");
    }
}
