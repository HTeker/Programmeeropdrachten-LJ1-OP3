package Opdracht_5;

/**
 * Created by H.Teker on 13-2-2017.
 */
public class Auto {

    private String kenteken;
    private int aantalDeuren;
    private String kleur;
    private String merk;
    private String type;
    private float maxSnelheid;
    private float kilometersOpLiter;
    private String brandstof;

    public void print(){
        printRowOutlined("Kenteken:", this.getKenteken());
        printRowOutlined("Aantal deuren:", Integer.toString(this.getAantalDeuren()));
        printRowOutlined("Kleur:", this.getKleur());
        printRowOutlined("Merk:", this.getMerk());
        printRowOutlined("Type:", this.getType());
        printRowOutlined("Maximum snelheid:", Float.toString(this.getMaxSnelheid()));
        printRowOutlined("Aantal km's op 1 l.:", Float.toString(this.getKilometersOpLiter()));
        printRowOutlined("Brandstof:", this.getBrandstof());
        System.out.printf("\n");
    }

    private void printRowOutlined(String left, String right) {
        System.out.printf("%-25s", left);
        System.out.printf("%s\n", right);
    }

    public void setKenteken(String kenteken){
        this.kenteken = kenteken;
    }

    public void setAantalDeuren(int aantalDeuren){
        this.aantalDeuren = aantalDeuren;
    }

    public void setKleur(String kleur){
        this.kleur = kleur;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setMaxSnelheid(float maxSnelheid){
        this.maxSnelheid = maxSnelheid;
    }

    public void setKilometersOpLiter(float kilometersOpLiter){
        this.kilometersOpLiter = kilometersOpLiter;
    }

    public void setBrandstof(String brandstof){
        this.brandstof = brandstof;
    }

    public String getKenteken(){
        return kenteken;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public String getKleur(){
        return kleur;
    }

    public String getMerk(){
        return merk;
    }

    public String getType(){
        return type;
    }

    public float getMaxSnelheid(){
        return maxSnelheid;
    }

    public float getKilometersOpLiter(){
        return kilometersOpLiter;
    }

    public String getBrandstof(){
        return brandstof;
    }
}