package Opdracht_9;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public abstract class Vorm {
    private double riblengte;

    public Vorm(){
        this.riblengte = 1;
    }

    public Vorm(double x){
        this.riblengte = x;
    }

    public void setRiblengte(double riblengte){
        this.riblengte = riblengte;
    }

    public double getRiblengte(){
        return this.riblengte;
    }

    public abstract double inhoud();
    public abstract double oppervlakte();

    public void print(){
        System.out.print("Riblengte: " + Double.toString(this.getRiblengte()) + "\n");
        System.out.print("Oppervlakte: " + Double.toString(this.oppervlakte()) + "\n");
        System.out.print("Inhoud: " + Double.toString(this.inhoud()) + "\n");
    }
}
