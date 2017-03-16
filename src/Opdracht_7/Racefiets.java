package Opdracht_7;

/**
 * Created by H.Teker on 16-3-2017.
 */
public class Racefiets extends Fiets {
    // De onderstaande properties zijn niet specifiek voor racefietsen, omdat het naar mijn inzicht onmogelijk is dat er bepaalde kenmerken zijn die specifiek gelden voor racefietsen
    int aantalVersnellingen;
    float luchtweerstand;

    public void setAantalVersnellingen(int aantalVersnellingen){
        this.aantalVersnellingen = aantalVersnellingen;
    }

    public int getAantalVersnellingen(){
        return this.aantalVersnellingen;
    }

    public void setLuchtweerstand(float luchtweerstand){
        this.luchtweerstand = luchtweerstand;
    }

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
