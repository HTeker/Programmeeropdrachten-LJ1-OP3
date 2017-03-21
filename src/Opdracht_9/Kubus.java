package Opdracht_9;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Kubus extends Vorm {
    public double inhoud(){
        return this.getRiblengte() * this.getRiblengte() * this.getRiblengte();
    }

    public double oppervlakte(){
        return this.getRiblengte() * this.getRiblengte();
    }
}
