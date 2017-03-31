package Opdracht_11;

/**
 * Created by H.Teker on 29-3-2017.
 */
public class Student {
    private String studentNummer;
    private String naam;
    private int leeftijd;

    public Student(String studentNummer, String naam, int leeftijd){

    }

    public void setStudentNummer(String studentNummer){
        this.studentNummer = studentNummer;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setLeeftijd(int leeftijd){
        this.leeftijd = leeftijd;
    }

    public String getStudentNummer(){
        return this.studentNummer;
    }

    public String getNaam(){
        return this.naam;
    }

    public String getLeeftijd(){
        return Integer.toString(this.leeftijd);
    }
}
