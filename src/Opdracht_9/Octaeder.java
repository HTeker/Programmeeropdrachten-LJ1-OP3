package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Octaeder extends Vorm {
    public double inhoud(){
        return (1/3) * Math.sqrt(2) * Math.pow(this.getRiblengte(), 3);
    }

    public double oppervlakte(){
        return 2 * Math.sqrt(3) * Math.pow(this.getRiblengte(), 2);
    }
}
