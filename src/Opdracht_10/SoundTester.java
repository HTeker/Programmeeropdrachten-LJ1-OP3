package Opdracht_10;

/**
 * Created by H.Teker on 21-3-2017.
 */
class SoundTester {
    private SoundProducer[] soundProducers = new SoundProducer[100];
    private int counter = 0;

    public void addSoundObject(SoundProducer o) {
        soundProducers[counter] = o;
        counter++;
    }
    public void playSoundProducers() {
        for (SoundProducer soundProducer : soundProducers ) {
            soundProducer.produceSound();
        }
    }
}
