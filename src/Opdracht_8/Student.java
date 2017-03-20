package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
class Student extends Persoon {
    private String klas;
    private Adres werkAdres;
    private Docent mentor;

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public Adres getWerkAdres() {
        return werkAdres;
    }

    public void setWerkAdres(Adres werkAdres) {
        this.werkAdres = werkAdres;
    }

    public Docent getMentor() {
        return mentor;
    }

    public void setMentor(Docent mentor) {
        this.mentor = mentor;
    }
}
