package Opdracht_7;

/**
 * Created by H.Teker on 16-3-2017.
 */
public class Fiets extends Vervoersmiddel {
    int aantalFleshouders;
    boolean terugtraprem;

    public void setAantalFleshouders(int aantalFleshouders){
        this.aantalFleshouders = aantalFleshouders;
    }

    public int getAantalFleshouders(){
        return this.aantalFleshouders;
    }

    public void setTerugtraprem(boolean terugtraprem){
        this.terugtraprem = terugtraprem;
    }

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