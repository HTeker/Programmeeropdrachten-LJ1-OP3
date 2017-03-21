package Opdracht_9;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Tetraeder extends Vorm {
    public double inhoud(){
        return (1/12) * Math.pow(this.getRiblengte(), 3) * Math.sqrt(2);
    }

    public double oppervlakte(){
        return Math.pow(this.getRiblengte(), 2) * Math.sqrt(3);
    }
}
