package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Raceauto extends Auto {
    /**
     * De maximale motorkracht van de raceauto
     */
    float maxKracht;
    /**
     * Geeft weer of de raceauto een achterwielaandrijving heeft
     */
    boolean achterwielaandrijving;

    /**
     * Zet de maximale kracht van de raceauto
     * @param maxKracht
     */
    public void setMaxKracht(float maxKracht){
        this.maxKracht = maxKracht;
    }

    /**
     * Geeft de maximale kracht van de raceauto
     * @return
     */
    public float getMaxKracht(){
        return this.maxKracht;
    }

    /**
     * Zet de waarde of de raceauto een achterwielaandrijving heeft
     * @param achterwielaandrijving
     */
    public void setAchterwielaandrijving(boolean achterwielaandrijving){
        this.achterwielaandrijving = achterwielaandrijving;
    }

    /**
     * Geeft de waarde of de raceauto een achterwielaandrijving heeft
     * @return
     */
    public boolean getAchterwielaandrijving(){
        return this.achterwielaandrijving;
    }

    public void print() {
        printRowOutlined("Capaciteit:", Integer.toString(this.getCapaciteit()));
        printRowOutlined("Snelheid:", Float.toString(this.getSnelheid()));
        printRowOutlined("Prijs:", Float.toString(this.getPrijs()));
        printRowOutlined("Massa:", Float.toString(this.getMassa()));
        printRowOutlined("Max kracht:", Float.toString(this.getMaxKracht()));
        printRowOutlined("Achterwielaandrijving:", (this.getAchterwielaandrijving()) ? "Ja" : "Nee");
        System.out.printf("\n");
    }
}
