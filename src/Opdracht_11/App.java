package Opdracht_11;

/**
 * Created by H.Teker on 29-3-2017.
 */
public class App {
    public static void main(String[] arguments){
        School school = new School();
        school.add(new Student(
                "015678",
                "Halil",
                22
        ));
        school.add(new Student(
                "014859",
                "Gabriel",
                23
        ));
        school.add(new Student(
                "035847",
                "Jaap",
                20
        ));
        school.add(new Student(
                "035948",
                "Lars",
                24
        ));

        school.printStudenten(new StudentenVergelijker() {
            @Override
            public boolean isGroter(Student o1, Student o2) {
                return o1.getNaam().compareTo(o2.getNaam()) > 0;
            }
        });
    }
}
