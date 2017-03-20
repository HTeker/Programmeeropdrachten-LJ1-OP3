package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
class Adres {
    private String straat;
    private String huisnummer;
    private String postcode;
    private String plaats;

    public Adres(String straat, String huisnummer, String postcode, String plaats) {
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPlaats() {
        return plaats;
    }
}
