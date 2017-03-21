package Opdracht_10;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Main {
    public static void main(String[] args) {
        SoundTester tester = new SoundTester();
        tester.addSoundObject( new Cat());
        tester.addSoundObject( new Speaker());
        tester.playSoundProducers();
    }
}