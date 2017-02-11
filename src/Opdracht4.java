/**
 * Created by H.Teker on 11-2-2017.
 */
public class Opdracht4 {
    public static void main (String[] arguments){
        Rechthoek r1 = new Rechthoek(100, 100);
        Rechthoek r2 = new Rechthoek(100, 100);

        System.out.println(r1.ernaast(r2).breedte);
    }
}
