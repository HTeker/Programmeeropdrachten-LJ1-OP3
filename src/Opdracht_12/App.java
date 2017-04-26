package Opdracht_12;

/**
 * Created by Halil Teker on 4/26/2017.
 */
public class App {
    public static void main(String[] args){
        Lift lift = new Lift();

        lift.openen();
        lift.sluiten();
        lift.verdiepingInstellen(3);
        lift.beweeg();

    }
}
