package Opdracht_5;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class App {

    public static void main(String[] arguments){
        Auto auto1 = new Auto();
        auto1.setKenteken("4-CSD-32");
        auto1.setAantalDeuren(4);
        auto1.setKleur("Zwart");
        auto1.setMerk("Audi");
        auto1.setType("A6");
        auto1.setMaxSnelheid(210.4f);
        auto1.setKilometersOpLiter(12.6f);
        auto1.setBrandstof("Diesel");

        Auto auto2 = new Auto();
        auto2.setKenteken("34-DF-23");
        auto2.setAantalDeuren(2);
        auto2.setKleur("Blauw");
        auto2.setMerk("Golf");
        auto2.setType("6");
        auto2.setMaxSnelheid(190.9f);
        auto2.setKilometersOpLiter(13.5f);
        auto2.setBrandstof("Benzine");

        Auto auto3 = new Auto();
        auto3.setKenteken("12-AS-23");
        auto3.setAantalDeuren(2);
        auto3.setKleur("Grijs");
        auto3.setMerk("Volkswagen");
        auto3.setType("Beetle");
        auto3.setMaxSnelheid(170.2f);
        auto3.setKilometersOpLiter(19.0f);
        auto3.setBrandstof("Diesel");

        //auto1.print();
        //auto2.print();
        //auto3.print();

        Auto[] autos = new Auto[5];
        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto3;

        Auto auto4 = new Auto();
        auto4.copyValues(auto1);
        auto4.setMaxSnelheid(200f);

        Auto auto5 = new Auto();
        auto5.copyValues(auto2);
        auto5.setMaxSnelheid(180f);

        autos[3] = auto4;
        autos[4] = auto5;

        for(Auto auto: autos){
            //auto.print();
        }

        App app = new App();
        Auto snelste = app.getSnelsteAuto(autos);
    }

    public Auto getSnelsteAuto(Auto[] autos){
        Auto snelste = new Auto();
        snelste.setMaxSnelheid(0);

        for(Auto auto: autos){
            if(auto.getMaxSnelheid() > snelste.getMaxSnelheid()){
                snelste = auto;
            }
        }

        return snelste;
    }
}
