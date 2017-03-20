package Opdracht_8;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class App {
    public static void main(String[] args) {
        Administratie bedrijfsbureau = new Administratie();

        Docent james = new Docent();
        james.setVoornaam("James");
        james.setAchternaam("Gosling");
        james.setId("gosja");

        Docent guido = new Docent();
        guido.setVoornaam("Guido");
        guido.setTussenvoegsel("van");
        guido.setAchternaam("Rossum");
        guido.setId("guiro");

        bedrijfsbureau.registreer(james);
        bedrijfsbureau.registreer(guido);

        Student foo = new Student();
        foo.setVoornaam("Foo");
        foo.setAchternaam("Bar");
        foo.setMentor(james);
        foo.setId("23456789");

        Student hello = new Student();
        hello.setVoornaam("Hello");
        hello.setAchternaam("World");
        hello.setMentor(guido);
        hello.setId("12345678");

        bedrijfsbureau.registreer(foo);
        bedrijfsbureau.registreer(hello);

        bedrijfsbureau.printAllePersonen();
    }
}