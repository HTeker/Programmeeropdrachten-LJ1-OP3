package Opdracht_6;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class Auto {

    private String naam;

    public Auto(String naam){
        this.setNaam(naam);
    }

    public void print(){
        System.out.println(this.getNaam());
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    }
}
