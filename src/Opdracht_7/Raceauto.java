package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Raceauto extends Auto {
    float maxKracht;
    boolean achterwielaandrijving;

    public void setMaxKracht(float maxKracht){
        this.maxKracht = maxKracht;
    }

    public int getMaxKracht(){
        return this.maxKracht;
    }

    public void setAchterwielaandrijving(boolean achterwielaandrijving){
        this.achterwielaandrijving = achterwielaandrijving;
    }

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
