package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Dodecaeder extends Vorm {
    public double inhoud(){
        return (1/4) * (15 + 7 * Math.sqrt(5)) * Math.pow(this.getRiblengte(), 3);
    }

    public double oppervlakte(){
        return 3 * Math.sqrt((25 + 10 * Math.sqrt(5))) * Math.pow(this.getRiblengte(), 2);
    }
}
