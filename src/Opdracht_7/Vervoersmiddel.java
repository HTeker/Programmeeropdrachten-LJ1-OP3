package Opdracht_7;

/**
 * Created by H.Teker on 16-3-2017.
 * @author Halil Teker
 * @version 1.0
 */
public class Vervoersmiddel {
    /**
     * Geeft weer hoeveel personen vervoert kunnen worden middels dit voertuig.
     */
    int capaciteit;
    /**
     * Geeft weer hoe snel dit voertuig kan vervoeren in kilometers per uur.
     */
    float snelheid;
    /**
     * Geeft weer hoeveel dit voertuig kost.
     */
    float prijs;
    /**
     * Geeft weer hoe zwaar dit voertuig is in kilogrammen.
     */
    float massa;

    /**
     * Zet een waarde voor de capaciteit van dit voertuig.
     * @param capaciteit
     */
    public void setCapaciteit(int capaciteit){
        this.capaciteit = capaciteit;
    }

    /**
     * Geeft de capaciteit van dit voertuig terug
     * @return de capaciteit
     */
    public int getCapaciteit(){
        return this.capaciteit;
    }

    /**
     * Zet een waarde voor de snelheid van dit voertuig.
     * @param snelheid
     */
    public void setSnelheid(float snelheid){
        this.snelheid = snelheid;
    }

    /**
     * Geeft de snelheid van dit voertuig terug
     * @return de snelheid
     */
    public float getSnelheid(){
        return this.snelheid;
    }

    /**
     * Zet een waarde voor de prijs van dit voertuig.
     * @param prijs
     */
    public void setPrijs(float prijs){
        this.prijs = prijs;
    }

    /**
     * Geeft de prijs van dit voertuig terug
     * @return de prijs
     */
    public float getPrijs(){
        return this.prijs;
    }

    /**
     * Zet een waarde voor de massa van dit voertuig.
     * @param massa
     */
    public void setMassa(float massa){
        this.massa = massa;
    }

    /**
     * Geeft de massa van dit voertuig terug
     * @return de massa
     */
    public float getMassa(){
        return this.massa;
    }

    /**
     * Print een overzicht van de velden van dit voertuig
     */
    public void print(){
        printRowOutlined("Capaciteit:", Integer.toString(this.getCapaciteit()));
        printRowOutlined("Snelheid:", Float.toString(this.getSnelheid()));
        printRowOutlined("Prijs:", Float.toString(this.getPrijs()));
        printRowOutlined("Massa:", Float.toString(this.getMassa()));
        System.out.printf("\n");
    }

    private void printRowOutlined(String left, String right) {
        System.out.printf("%-25s", left);
        System.out.printf("%s\n", right);
    }

}
