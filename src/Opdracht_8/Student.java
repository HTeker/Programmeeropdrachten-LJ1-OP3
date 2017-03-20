package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
class Student {
    private String id; // studentnr
    private String voornaam;
    private String achternaam;
    private String tussenvoegsel;
    private String klas;
    private Adres woonAdres;
    private Adres werkAdres;
    private Docent mentor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getVolledigeNaam() {
        if (tussenvoegsel == null) {
            return voornaam + " " + achternaam;
        } else {
            return voornaam + " " + tussenvoegsel + " " + achternaam;
        }
    }

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public Adres getWoonAdres() {
        return woonAdres;
    }

    public void setWoonAdres(Adres woonAdres) {
        this.woonAdres = woonAdres;
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
