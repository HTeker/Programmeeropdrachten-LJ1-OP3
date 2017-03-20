package Opdracht_7;

/**
 * Created by H.Teker on 16-3-2017.
 * @author Halil Teker
 * @version 1.0
 */
public class Fiets extends Vervoersmiddel {
    /**
     * Aantal fleshouders van de fiets
     */
    int aantalFleshouders;
    /**
     * Bevat een true of false waarde of de fiets een terugtraprem systeem heeft
     */
    boolean terugtraprem;

    /**
     * Zet de waarde voor de aantal fleshouders van de fiets
     * @param aantalFleshouders
     */
    public void setAantalFleshouders(int aantalFleshouders){
        this.aantalFleshouders = aantalFleshouders;
    }

    /**
     * Geeft het aantal fleshouders van de fiets terug
     * @return
     */
    public int getAantalFleshouders(){
        return this.aantalFleshouders;
    }

    /**
     * Zet de waarde of de fiets een terugtraprem heeft
     * @param terugtraprem
     */
    public void setTerugtraprem(boolean terugtraprem){
        this.terugtraprem = terugtraprem;
    }

    /**
     * Geeft of de fiets een terugtraprem heeft
     * @return
     */
    public boolean getTerugtraprem(){
        return this.terugtraprem;
    }

    public void print(){
        printRowOutlined("Capaciteit:", Integer.toString(this.getCapaciteit()));
        printRowOutlined("Snelheid:", Float.toString(this.getSnelheid()));
        printRowOutlined("Prijs:", Float.toString(this.getPrijs()));
        printRowOutlined("Massa:", Float.toString(this.getMassa()));
        printRowOutlined("Aantal fleshouders:", Integer.toString(this.getAantalFleshouders()));
        printRowOutlined("Terugtraprem:", (this.getTerugtraprem()) ? "Ja" : "Nee");
        System.out.printf("\n");
    }
}