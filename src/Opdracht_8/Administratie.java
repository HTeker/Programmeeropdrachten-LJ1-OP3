package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
class Administratie {
    private Persoon[] personen = new Persoon[100]; // De school heeft een max capaciteit van 100 docenten/studenten
    private int aantalPersonen = 0;

    public void registreer(Persoon persoon) {
        personen[aantalPersonen] = persoon;
        aantalPersonen++;
    }

    public void printAllePersonen() {
        for (int i = 0; i < aantalPersonen; i++) {
            Persoon persoon = personen[i];

            if (persoon instanceof Persoon) {
                System.out.println(persoon.getVolledigeNaam());
            } else {
                System.out.println("Error! " + " het object " + persoon + " lijkt geen persoon/docent/student te zijn!");
            }
        }
    }
}
