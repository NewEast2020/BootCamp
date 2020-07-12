import java.util.Random;
import java.util.Scanner;

// Galgje XtremeProgramming
public class GalgjeXtremeProgramming {
    public static void main(String[] args){
        Random rand    = new Random();
        Scanner reader = new Scanner(System.in);
        boolean speelGalgje = true;
        boolean isGeraden;
        boolean isPogingGelukt;

        String[] woordenlijst = {"zeeslag","mijnenveger","galgje","schaken","dammen","waterpolo"};
        int aantalWoordenInDeLijst = woordenlijst.length;
        int indexTeRadenWoord = rand.nextInt(aantalWoordenInDeLijst);
        String TeRadenWoord = woordenlijst[indexTeRadenWoord];

        int maximaalAantalFouten = 6;
        int aantalMisluktePogingenSpeler = 0;
        char[] spelerWoord = TeRadenWoord.toCharArray();

        System.out.println("======Galgje=====");
        initialiseerSpelerWoord(TeRadenWoord, spelerWoord);
        char invoerLetter = getInvoerLetter1(reader);

        while(speelGalgje){
            isPogingGelukt = controleerDeLetter(invoerLetter,TeRadenWoord,spelerWoord);
            isGeraden = controleWoordGeraden (TeRadenWoord,spelerWoord);

            if (!isPogingGelukt){
                aantalMisluktePogingenSpeler++;
            }
            toonOverzicht(spelerWoord);

            if (!isGeraden) {
                toonPoppetje(aantalMisluktePogingenSpeler);
                speelGalgje = isSpeelGalgje(aantalMisluktePogingenSpeler, maximaalAantalFouten, speelGalgje);
                invoerLetter = getInvoerLetter2(reader, invoerLetter, speelGalgje);
            }
            else {
                System.out.println("Bedankt voor het spelen en tot een volgende keer.");
                speelGalgje = false;
            }
        }
    }

    private static char getInvoerLetter1(Scanner reader) {
        System.out.print("Voer een letter in: ");
        return reader.nextLine().charAt(0);
    }

    private static char getInvoerLetter2(Scanner reader, char invoerLetter, boolean speelGalgje) {
        if (speelGalgje) {
            invoerLetter = reader.nextLine().charAt(0);
        }
        return invoerLetter;
    }

    private static void initialiseerSpelerWoord(String teRadenWoord, char[] spelerWoord) {
        for (int k = 0; k< teRadenWoord.length(); k++){
            spelerWoord[k]= '*';
        }
    }

    private static boolean isSpeelGalgje(int aantalMisluktePogingenSpeler, int maximaalAantalFouten, boolean speelGalgje) {
        if (aantalMisluktePogingenSpeler > maximaalAantalFouten) {
            System.out.println("Je hebt verloren. ");
            speelGalgje = false;
        }
        return speelGalgje;
    }

    private static boolean controleWoordGeraden(String TeRadenWoord,char[] spelerWoord){
        boolean isWoordGeraden = true;
        for (int k=0 ; k<spelerWoord.length;k++){
            if (spelerWoord[k] != TeRadenWoord.charAt(k)) {
                isWoordGeraden=false;
            }
        }
        if (isWoordGeraden) {
            System.out.print("Woord geraden! ");
        }
        return isWoordGeraden;
    }

    private static boolean controleerDeLetter(char invoerLetter,String TeRadenWoord,char[] spelerWoord){
        boolean isLetterGevonden = false;
        for (int k=0 ; k<TeRadenWoord.length();k++){
            if (invoerLetter == TeRadenWoord.charAt(k)) {
               spelerWoord[k] = TeRadenWoord.charAt(k);
               isLetterGevonden = true;
            }
        }
        if (!isLetterGevonden) {
            System.out.print("Letter komt niet voor ! ");
        }
         return isLetterGevonden;
    }

    private static void toonOverzicht(char[] spelerWoord){
        for (int k=0; k<spelerWoord.length;k++){
            System.out.print(spelerWoord[k]);

        }
        System.out.println(" ");
    }

    private static void toonPoppetje(int misluktePogingen) {
        if (misluktePogingen > 0) {
            System.out.println("   |");
        }

        if (misluktePogingen > 1) {
            System.out.println("   O");
        }

        if (misluktePogingen > 4) {
            System.out.println(" --|--");
        }
        else if (misluktePogingen > 3) {
            System.out.println(" --|");
        }
        else if (misluktePogingen > 2) {
            System.out.println("   |");
        }

        if (misluktePogingen > 6) {
            System.out.println("  / \\");
        }
        else if (misluktePogingen > 5) {
            System.out.println("  /");
        }
    }
}
