import javax.swing.*;
import java.util.Arrays;

/**
 * Created by H.Teker on 11-2-2017.
 */
public class Opdracht3 {
    String[] input = new String[10];

    static JFrame frame = new JFrame("InputDialog Example #1");

    public static void main (String [] arguments){
        Opdracht3 opdr3 = new Opdracht3();

        opdr3.askUserInput();

        System.out.println("Het totaal aantal karakters van uw invoer: " + opdr3.countCharacters());
    }

    private int countCharacters() {
        int count = 0;

        for(int i = 0; i < this.input.length; i++){
            count += this.input[i].length();
        }

        return count;
    }

    private void askUserInput() {
        for(int i = 0; i < 10; i++){
            this.input[i] = JOptionPane.showInputDialog(frame, "Voer een woord/zin in:");
        }
    }
}
