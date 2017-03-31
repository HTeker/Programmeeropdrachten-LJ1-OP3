package Opdracht_11;

import java.util.*;

/**
 * Created by H.Teker on 29-3-2017.
 */
public class School {
    private List<Student> studenten = new ArrayList<Student>();

    public void add(Student student){
        this.studenten.add(student);
    }

    public void printStudenten(final StudentenVergelijker vergelijker) {
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return vergelijker.isGroter(o1, o2) ? -1 : 1;
            }
        };

        List<Student> copy = new ArrayList<Student>(studenten);
        Collections.sort(copy, comp);

        for (Student s : copy) {
            System.out.println(s);
        }
    }
}
