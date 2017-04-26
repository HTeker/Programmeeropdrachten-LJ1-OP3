package Opdracht_12;

/**
 * Created by Halil Teker on 4/26/2017.
 */
public class InBeweging implements Toestand {
    Lift lift;

    public InBeweging(Lift lift){
        this.lift = lift;
    }

    @Override
    public void verdiepingInstellen(int verdieping) {
        System.out.println("Niet toegestaan");
    }

    @Override
    public void openen() {
        System.out.println("Niet toegestaan");
    }

    @Override
    public void sluiten() {
        System.out.println("Niet toegestaan");
    }

    @Override
    public void beweeg() {
        if(lift.getHuidigeVerdieping() == lift.getGekozenVerdieping()){
            System.out.println("Verdieping bereikt, deur wordt gesloten.");
            lift.setHuidigeToestand(lift.getDeurIsGesloten());
        }else{
            System.out.println("Bewegen naar juiste verdieping");
        }
    }
}
