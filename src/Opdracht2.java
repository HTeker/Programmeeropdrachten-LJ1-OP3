/**
 * Created by H.Teker on 11-2-2017.
 */
public class Opdracht2 {

    public static void main (String [] arguments){
        printHi();
        System.out.println(1 + 1);
        printHi();
    }

    private static void printHi() {
        printNonCenter();
        printCenter();
        printNonCenter();
    }

    private static void printCenter() {
        System.out.println("HHHHH  I");
    }

    public static void printNonCenter(){
        for(int i = 0; i < 3; i++){
            System.out.println("H   H  I");
        }
    }
}
