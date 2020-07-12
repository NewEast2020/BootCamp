import java.util.ArrayList;
import java.util.Random;

public class KaartSchudden {
    public static void main(String[] args) {
        ArrayList<String> kaarten = new ArrayList<>();
        ArrayList<String> kaarten2 = new ArrayList<>();

        Random rand = new Random();

        maakKaarten(kaarten);

        schudKaarten(kaarten, kaarten2, rand);
    }

    private static void maakKaarten(ArrayList<String> kaarten) {
        String Soort;
        String kleur;
        String nummerFig;
        String kaart;
        for (int j = 0; j < 4; j++) {
            switch (j) {
                case 0 : Soort = "Schoppen"; kleur = "Zwart"; break;
                case 1 : Soort = "Ruiten";   kleur = "Rood" ; break;
                case 2 : Soort = "Harten";   kleur = "Rood" ; break;
                default: Soort = "Klaveren"; kleur = "Zwart"; break;
            }

            for (int i = 1; i < 14; i++) {
                switch (i) {
                    case  1 : nummerFig = "Aas"  ; break;
                    case 11 : nummerFig = "Boer" ; break;
                    case 12 : nummerFig = "Vrouw"; break;
                    case 13 : nummerFig = "Heer" ; break;
                    default : nummerFig = Integer.toString(i);
                }
                kaart = Soort + " " + nummerFig + " " + kleur;
                kaarten.add(kaart);
            }
        }
    }

    private static void schudKaarten(ArrayList<String> kaarten, ArrayList<String> kaarten2, Random rand) {
        int shuffle;
        for (int k = kaarten.size()-1; k >=0; k--) {
            shuffle = rand.nextInt(k+1);
            kaarten2.add(kaarten.get(shuffle));
            kaarten.remove(shuffle);
        }
        for (int k = 0; k < kaarten2.size(); k++) {
            System.out.println(k + " " + kaarten2.get(k));
        }
    }
}
