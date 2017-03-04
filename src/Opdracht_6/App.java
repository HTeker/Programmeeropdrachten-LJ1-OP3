package Opdracht_6;

import java.util.Random;

/**
 * Created by H.Teker on 4-3-2017.
 */
public class App {
    public static void main(String[] arguments){
        Oever[] oevers = new Oever[2];
        oevers[0] = new Oever("Noordelijke oever");
        oevers[1] = new Oever("Zuidelijke oever");
        Pont pont = new Pont("Bootje");
        Auto auto = new Auto("Porsche Cayenne");

        oevers[0].setAuto(auto);
        oevers[0].print();
        oevers[0].setPont(pont);
        oevers[0].print();
        pont.setAuto(oevers[0].getAuto());
        pont.print();
        oevers[0].setAuto(null);
        oevers[0].print();
        oevers[1].setPont(oevers[0].getPont());
        oevers[1].print();
        oevers[0].setPont(null);
        oevers[0].print();
        oevers[1].setAuto(pont.getAuto());
        oevers[1].print();
        pont.setAuto(null);
        pont.print();
    }
}
