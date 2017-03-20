package Opdracht_7;

/**
 * Created by Halil Teker on 3/20/2017.
 */
public class Program {
    public static void main(String[] arguments){
        Vervoersmiddel[] vervoersmiddellen = new Vervoersmiddel[10];

        vervoersmiddellen[0] = new Fiets();
        vervoersmiddellen[0].setMassa(38);

        vervoersmiddellen[1] = new Raceauto();
        vervoersmiddellen[1].setMassa(1200);

        vervoersmiddellen[2] = new Racefiets();
        vervoersmiddellen[2].setMassa(20);

        vervoersmiddellen[3] = new Fiets();
        vervoersmiddellen[3].setMassa(45);

        vervoersmiddellen[4] = new Auto();
        vervoersmiddellen[4].setMassa(895);

        vervoersmiddellen[5] = new Raceauto();
        vervoersmiddellen[5].setMassa(1345);

        vervoersmiddellen[6] = new Racefiets();
        vervoersmiddellen[6].setMassa(21);

        vervoersmiddellen[7] = new Fiets();
        vervoersmiddellen[7].setMassa(42);

        vervoersmiddellen[8] = new Auto();
        vervoersmiddellen[8].setMassa(923);

        vervoersmiddellen[9] = new Raceauto();
        vervoersmiddellen[9].setMassa(1345);

        checkHeaviestAndLightest(vervoersmiddellen);
    }

    public static void checkHeaviestAndLightest(Vervoersmiddel[] vervoersmiddellen){
        Vervoersmiddel zwaarste = new Vervoersmiddel();
        Vervoersmiddel lichtste = vervoersmiddellen[0];

        for(int i = 0; i < vervoersmiddellen.length; i++){
            if(zwaarste.getMassa() < vervoersmiddellen[i].getMassa()){
                zwaarste = vervoersmiddellen[i];
            }

            if(lichtste.getMassa() > vervoersmiddellen[i].getMassa()){
                lichtste = vervoersmiddellen[i];
            }
        }

        System.out.printf("Zwaarste voertuig: \n\n");
        zwaarste.print();
        System.out.printf("Lichtste voertuig: \n\n");
        lichtste.print();

    }
}
