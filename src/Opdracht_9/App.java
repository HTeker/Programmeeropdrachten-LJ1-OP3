package Opdracht_9;

/**
 * Created by H.Teker on 21-3-2017.
 */
public class App {
    public static void main(String[] arguments){
        Vorm[] vormen1 = new Vorm[5];
        vormen1[0] = new Dodecaeder();
        vormen1[1] = new Hexaeder();
        vormen1[2] = new Icosaeder();
        vormen1[3] = new Kubus();
        vormen1[4] = new Tetraeder();

        Vorm[] vormen2 = new Vorm[5];
        vormen2[0] = new Dodecaeder();
        vormen2[1] = new Hexaeder();
        vormen2[2] = new Icosaeder();
        vormen2[3] = new Kubus();
        vormen2[4] = new Tetraeder();

        Vorm[] vormen3 = new Vorm[5];
        vormen3[0] = new Dodecaeder();
        vormen3[1] = new Hexaeder();
        vormen3[2] = new Icosaeder();
        vormen3[3] = new Kubus();
        vormen3[4] = new Tetraeder();

        Onderzoeker onderzoeker = new Onderzoeker();

        onderzoeker.maxinhoud(vormen1);
        onderzoeker.minoppervlakte(vormen2);
        onderzoeker.maxverhouding(vormen1);
        onderzoeker.maxverhouding(vormen2);
        onderzoeker.maxverhouding(vormen3);
    }
}
