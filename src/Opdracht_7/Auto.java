package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Auto extends Vervoersmiddel {
    /**
     * Het aantal deuren die de auto heeft
     */
    int aantalDeuren;
    /**
     * Het aantal zitplaatsen die de auto heeft
     */
    int aantalZitPlaatsen;

    /**
     * Zet het aantal deuren van de auto
     * @param aantalDeuren
     */
    public void setAantalDeuren(int aantalDeuren){
        this.aantalDeuren = aantalDeuren;
    }

    /**
     * Geeft het aantal deuren van de auto
     * @return
     */
    public int getAantalDeuren(){
        return this.aantalDeuren;
    }

    /**
     * Zet het aantal zitplaatsen van de auto
     * @param aantalZitPlaatsen
     */
    public void setAantalZitPlaatsen(int aantalZitPlaatsen){
        this.aantalZitPlaatsen = aantalZitPlaatsen;
    }

    /**
     * Geeft het aantal zitplaatsen van de auto
     * @return
     */
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
