package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
class Administratie {
    private Object[] personen = new Object[100]; // De school heeft een max capaciteit van 100 docenten/studenten
    private int aantalPersonen = 0;

    public void registreer(Student student) {
        personen[aantalPersonen] = student;
        aantalPersonen++;
    }

    public void registreer(Docent docent) {
        personen[aantalPersonen] = docent;
        aantalPersonen++;
    }

    public void printAllePersonen() {
        for (int i = 0; i < aantalPersonen; i++) {
            Object persoon = personen[i];

            if (persoon instanceof Docent) {
                Docent docent = (Docent) persoon;
                System.out.println(docent.getVolledigeNaam());
            } else if (persoon instanceof Student) {
                Student student = (Student) persoon;
                System.out.println(student.getVolledigeNaam());
            } else {
                System.out.println("Error! " + " het object " + persoon + " lijkt geen persoon/docent/student te zijn!");
            }
        }
    }
}
