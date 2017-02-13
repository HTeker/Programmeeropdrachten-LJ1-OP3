package Opdracht_5;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class App {

    public static void main(String[] arguments){
        Auto auto = new Auto();

        auto.setKenteken("4-CSD-32");
        auto.setAantalDeuren(4);
        auto.setKleur("Zwart");
        auto.setMerk("Audio");
        auto.setType("A6");
        auto.setMaxSnelheid(210.4f);
        auto.setKilometersOpLiter(12.6f);
        auto.setBrandstof("Diesel");

        auto.print();
    }
}
