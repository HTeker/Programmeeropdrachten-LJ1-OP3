package Opdracht_7;

/**
 * Created by H.Teker on 16-3-2017.
 */
public class Racefiets extends Fiets {
    // De onderstaande properties zijn niet specifiek voor racefietsen, omdat het naar mijn inzicht onmogelijk is dat er bepaalde kenmerken zijn die specifiek gelden voor racefietsen
    /**
     * Het aantal versnellingen dat de racefiets heeft
     */
    int aantalVersnellingen;
    /**
     * De weerstand die de racefiets heeft tegen wind
     */
    float luchtweerstand;

    /**
     * Zet het aantal versnellingen van de racefiets
     * @param aantalVersnellingen
     */
    public void setAantalVersnellingen(int aantalVersnellingen){
        this.aantalVersnellingen = aantalVersnellingen;
    }

    /**
     * Geeft het aantal versnellingen dat de racefiets heeft
     * @return
     */
    public int getAantalVersnellingen(){
        return this.aantalVersnellingen;
    }

    /**
     * Zet de weerstand die de racefiets heeft
     * @param luchtweerstand
     */
    public void setLuchtweerstand(float luchtweerstand){
        this.luchtweerstand = luchtweerstand;
    }

    /**
     * Geeft de weerstand die de racefiets heeft
     * @return
     */
    public float getLuchtweerstand(){
        return this.luchtweerstand;
    }

    public void print(){
        printRowOutlined("Capaciteit:", Integer.toString(this.getCapaciteit()));
        printRowOutlined("Snelheid:", Float.toString(this.getSnelheid()));
        printRowOutlined("Prijs:", Float.toString(this.getPrijs()));
        printRowOutlined("Massa:", Float.toString(this.getMassa()));
        printRowOutlined("Aantal fleshouders:", Integer.toString(this.getAantalFleshouders()));
        printRowOutlined("Terugtraprem:", (this.getTerugtraprem()) ? "Ja" : "Nee");
        printRowOutlined("Aantal versnellingen:", Integer.toString(this.getAantalFleshouders()));
        printRowOutlined("Luchtweerstand:", Float.toString(this.getAantalFleshouders()));
        System.out.printf("\n");
    }
}
