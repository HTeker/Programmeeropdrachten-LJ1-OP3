package Opdracht_6;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class Pont {
    private Auto auto;
    private String naam;

    public Pont(String naam){
        this.setNaam(naam);
    }

    public void print(){
        Auto auto = this.getAuto();
        if(auto != null){
            System.out.print("De volgende auto staat op deze pont (" + this.getNaam() + "): ");
            System.out.println(auto.getNaam());
        }else{
            System.out.println("Er staat geen auto op deze pont (" + this.getNaam() + ")");
        }
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setAuto(Auto auto){
        this.auto = auto;
    }

    public String getNaam(){
        return this.naam;
    }

    public Auto getAuto(){
        return this.auto;
    }
}
