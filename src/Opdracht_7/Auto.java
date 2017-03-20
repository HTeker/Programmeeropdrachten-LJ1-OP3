package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Auto extends Vervoersmiddel {
    int aantalDeuren;
    int aantalZitPlaatsen;

    public void setAantalDeuren(int aantalDeuren){
        this.aantalDeuren = aantalDeuren;
    }

    public int getAantalDeuren(){
        return this.aantalDeuren;
    }

    public void setAantalZitPlaatsen(int aantalZitPlaatsen){
        this.aantalZitPlaatsen = aantalZitPlaatsen;
    }

    public int getAantalZitPlaatsen(){
        return this.aantalZitPlaatsen;
    }

    public void print() {
        printRowOutlined("Capaciteit:", Integer.toString(this.getCapaciteit()));
        printRowOutlined("Snelheid:", Float.toString(this.getSnelheid()));
        printRowOutlined("Prijs:", Float.toString(this.getPrijs()));
        printRowOutlined("Massa:", Float.toString(this.getMassa()));
        printRowOutlined("Aantal deuren:", Integer.toString(this.getAantalDeuren()));
        printRowOutlined("Aantal zitplaatsen:", Integer.toString(this.getAantalZitPlaatsen()));
        System.out.printf("\n");
    }
}
