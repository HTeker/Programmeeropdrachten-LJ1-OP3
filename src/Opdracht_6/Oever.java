package Opdracht_6;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class Oever {

    private String naam;
    private Auto auto;
    private Pont pont;

    public Oever(String naam){
        this.setNaam(naam);
    }

    public void main(String[] arguments){
        Oever oever = new Oever("Test");
        oever.print();
    }

    public void print(){
        Auto auto = this.getAuto();
        if(auto != null){
            System.out.print("De volgende auto staat op deze oever (" + this.getNaam() +"): ");
            System.out.println(auto.getNaam());
        }else{
            System.out.println("Er staat geen auto op deze oever (" + this.getNaam() +")");
        }

        Pont pont = this.getPont();
        if(pont != null){
            System.out.println("De pont ligt aan deze oever (" + this.getNaam() +")");
        }else{
            System.out.println("De pont ligt niet aan deze oever (" + this.getNaam() +")");
        }
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setAuto(Auto auto){
        this.auto = auto;
    }

    public void setPont(Pont pont){
        this.pont = pont;
    }

    public String getNaam(){
        return this.naam;
    }

    public Auto getAuto(){
        return this.auto;
    }

    public Pont getPont(){
        return this.pont;
    }
}
