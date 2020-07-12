import java.util.Scanner;
import java.util.Random;

public class Galgje {
    public static void main(String[] args) {
        Random rand = new Random();
        int woordKeuze = rand.nextInt(3);
        int aantalPogingen = 0;
        int maxAantalPogingen = 5;
        String[] woordenLijst = {"Basic","Cobol","Algol"};
        String teRadenWoord0 =  woordenLijst[woordKeuze];
        char[] teRadenWoord = teRadenWoord0.toCharArray();
        char[] spelerWoord= {'*','*','*','*','*'};
        Scanner reader = new Scanner(System.in);
        boolean letterGeraden;

        System.out.println("Voer een letter in");

        while(aantalPogingen<maxAantalPogingen && !isWoordGeraden(spelerWoord)) {

            char input  = reader.nextLine().charAt(0);

            letterGeraden = isLetterGeraden(teRadenWoord, spelerWoord, input);

            aantalPogingen = getAantalPogingen(aantalPogingen, maxAantalPogingen, spelerWoord, letterGeraden);

            if (isWoordGeraden(spelerWoord) )  {
            System.out.println("Geraden ! " ) ;}
        }

        System.out.println("Tot de volgende keer");
    }

    private static int getAantalPogingen(int aantalPogingen, int maxAantalPogingen, char[] spelerWoord, boolean letterGeraden) {
        if (!letterGeraden){aantalPogingen++;}
        overzicht(spelerWoord);
        System.out.println(" Over :"  + (maxAantalPogingen-aantalPogingen) + " pogingen" );
        return aantalPogingen;
    }

    private static boolean isLetterGeraden(char[] teRadenWoord, char[] spelerWoord, char input) {
        boolean letterGeraden = false;

        for (int k=0; k<teRadenWoord.length;k++) {
            if (input==teRadenWoord[k]) {
                spelerWoord[k]=teRadenWoord[k];
                letterGeraden = true;
            }
        }
        return letterGeraden;
    }

    public static void overzicht(char[] spelerWoord) {
        for(int k=0;k<spelerWoord.length;k++) {
            System.out.print(spelerWoord[k]);
        }
        System.out.println("");
    }

    public static boolean isWoordGeraden(char[] spelerWoord) {
        for(int k=0; k< spelerWoord.length;k++) {
            if(spelerWoord[k]=='*') {
                return false;
            }
        }
        return true;
    }
}
