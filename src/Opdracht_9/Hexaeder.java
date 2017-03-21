package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Hexaeder extends Vorm {
    public double inhoud(){
        return Math.pow(this.getRiblengte(), 3);
    }

    public double oppervlakte(){
        return 6 * Math.pow(this.getRiblengte(), 2);
    }
}