import java.util.Random;
import javax.swing.*;

/**
 * Created by H.Teker on 11-2-2017.
 */
public class Opdracht1 {

    int randomNumber;
    int guess;
    boolean guessed = false;

    static int min = 0;
    static int max = 100;
    static int attempts = 7;
    static JFrame frame;

    public static void main (String [] arguments){
        Opdracht1 opdr1 = new Opdracht1();
        frame = new JFrame("InputDialog Example #1");

        opdr1.generateRandomNumber();

        opdr1.askUserToGuess();

        if(!opdr1.guessed){
            System.out.println("Helaas, het is je niet gelukt. Het getal was: " + opdr1.randomNumber);
        }
    }

    private void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(max - min + 1) + min;
    }

    private void askUserToGuess(){
        for(int i = 1; i <= attempts; i++){
            this.guess = Integer.parseInt(JOptionPane.showInputDialog(frame, "Raad het getal (tussen 0 en 100):"));

            if(this.guess == this.randomNumber){
                System.out.println("Je hebt juist gegokt!");
                this.guessed = true;
                break;
            }else{
                if(this.guess < this.randomNumber){
                    System.out.println("Je hebt te laag gegokt.");
                }else{
                    System.out.println("Je hebt te hoog gegokt.");
                }
            }
        }
    }

}
