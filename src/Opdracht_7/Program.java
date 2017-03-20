package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Program {
    public static void main(String[] arguments){
        Fiets fiets = new Fiets();
        fiets.setCapaciteit(2);
        fiets.setAantalFleshouders(0);
        fiets.setTerugtraprem(false);
        fiets.setMassa(38);
        fiets.setPrijs(238.50f);
        fiets.setSnelheid(45);
        fiets.print();
    }
}
