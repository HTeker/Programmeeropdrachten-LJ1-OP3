package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class Onderzoeker {
    private boolean keur(Vorm[] v){
        for(int i = 0; i < v.length; i++){
            if(v[i] == null){
                return false;
            }
        }
        return true;
    }

    public void maxinhoud(Vorm[] v){
        Vorm grootste = v[0];

        for(int i = 0; i < v.length; i++){
            if(grootste.inhoud() < v[i].inhoud()){
                grootste = v[i];
            }
        }

        grootste.print();
    }

    public void minoppervlakte(Vorm[] v){
        Vorm kleinste = v[0];

        for(int i = 0; i < v.length; i++){
            if(kleinste.oppervlakte() > v[i].oppervlakte()){
                kleinste = v[i];
            }
        }

        kleinste.print();
    }

    public void maxverhouding(Vorm[] v){
        Vorm max = v[0];
        double verhouding = v[0].oppervlakte() / v[0].inhoud();

        for(int i = 0; i < v.length; i++){
            if(verhouding < v[i].oppervlakte() / v[i].inhoud()){
                verhouding = v[i].oppervlakte() / v[i].inhoud();
                max = v[i];
            }
        }

        max.print();
    }
}
