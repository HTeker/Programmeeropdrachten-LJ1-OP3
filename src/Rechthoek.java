/**
 * Created by H.Teker on 11-2-2017.
 */
public class Rechthoek extends Figuur {

    public Rechthoek(int hoogte, int breedte){
        this.hoogte = hoogte;
        this.breedte = breedte;
    }

    public Figuur ernaast(Rechthoek rechthoek){
        Figuur figuur;

        if(this.hoogte == rechthoek.hoogte){
            figuur = new Rechthoek(this.hoogte, this.breedte + rechthoek.breedte);
        }
        else{
            figuur = new ComplexFiguur();
        }

        return figuur;
    }
}
