package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Icosaeder extends Vorm {
    public double inhoud(){
        return (5/12) * (3 + Math.sqrt(5)) * Math.pow(this.getRiblengte(), 3);
    }

    public double oppervlakte(){
        return 5 * Math.sqrt(3) * Math.pow(this.getRiblengte(), 2);
    }
}
