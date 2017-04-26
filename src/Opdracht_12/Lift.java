package Opdracht_12;

/**
 * Created by Halil Teker on 4/26/2017.
 */
public class Lift {
    Toestand deurIsOpen;
    Toestand deurIsGesloten;
    Toestand inBeweging;

    private int huidigeVerdieping;
    private int gekozenVerdieping;
    private Toestand huidigeToestand;

    public Lift(){
        deurIsOpen = new DeurIsOpen(this);
        deurIsGesloten = new DeurIsGesloten(this);
        inBeweging = new InBeweging(this);

        huidigeToestand = deurIsGesloten;
    }

    public void openen(){
        huidigeToestand.openen();
    }

    public void sluiten(){
        huidigeToestand.sluiten();
    }

    public void beweeg(){
        huidigeToestand.beweeg();
    }

    public void verdiepingInstellen(int verdieping){
        huidigeToestand.verdiepingInstellen(verdieping);
    }

    public void setGekozenVerdieping(int verdieping){
        this.gekozenVerdieping = verdieping;
    }

    public int getGekozenVerdieping(){
        return gekozenVerdieping;
    }

    public void setHuidigeVerdieping(int verdieping){
        this.huidigeVerdieping = verdieping;
    }

    public int getHuidigeVerdieping() {
        return huidigeVerdieping;
    }

    public void setHuidigeToestand(Toestand toestand){
        this.huidigeToestand = toestand;
    }

    public Toestand getHuidigeToestand(){
        return this.huidigeToestand;
    }

    public Toestand getDeurIsOpen(){
        return deurIsOpen;
    }

    public Toestand getDeurIsGesloten(){
        return deurIsGesloten;
    }

    public Toestand getInBeweging(){
        return inBeweging;
    }
}
