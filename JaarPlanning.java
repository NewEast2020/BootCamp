// Kalender van 1 willekeurig jaar
import java.util.Scanner;

public class JaarPlanning {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welk weekdag is 1 januari ?");
        String weekDag = reader.nextLine();
        int startDag =  bepaalDagNummer(weekDag);
        System.out.println("Welk jaar is het ?");
        int jaar = reader.nextInt();
        int aantalDagen = aantalDagenJaar(jaar);
        for (int d = startDag,  d2 = 1; d<(aantalDagen+startDag); d++, d2++){
                System.out.print(bepaalNaamDag(d % 7) + " " +
                                 bepaalWelkeDagNummer(d2,jaar) + " " +
                                 bepaalWelkeMaand(d2,jaar) + ", ");
            if(d % 7 == 0) System.out.println(" ");
        }
        System.out.println("\nklaar");
    }
    public static boolean schrikkelJaar(int jaar) {
        return (((jaar % 4 == 0) && (jaar % 100 != 0)) || (jaar % 400 == 0));
    }
    public static int aantalDagenJaar(int jaar) {
        if (schrikkelJaar(jaar))
          return 366;
        else
          return 365;
    }
    public static int bepaalDagNummer(String weekDag){
        switch(weekDag){
            case "maandag"   : return 1;
            case "dinsdag"   : return 2;
            case "woensdag"  : return 3;
            case "donderdag" : return 4;
            case "vrijdag"   : return 5;
            case "zaterdag"  : return 6;
            case "zondag"    : return 7;
        }
        return 9;
    }
    public static String bepaalNaamDag(int dagNummer ){
        switch(dagNummer){
            case 1: return "maandag"  ;
            case 2: return "dinsdag"  ;
            case 3: return "woensdag" ;
            case 4: return "donderdag";
            case 5: return "vrijdag"  ;
            case 6: return "zaterdag" ;
            case 7: return "zondag"  ;
            case 0: return "zondag"  ;
        }
        return "geendag";
    }
    public static String bepaalWelkeMaand(int d366,int jaar){
        if (schrikkelJaar(jaar)){
            return getMaand(d366, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366);
        } else {
            return getMaand(d366, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365);
        }
    }

    private static String getMaand(int d366, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (d366 <= 31) return "januari";
        if (d366 <= 59) return "februari";
        if (d366 <= i) return "maart";
        if (d366 <= i2) return "april";
        if (d366 <= i3) return "mei";
        if (d366 <= i4) return "juni";
        if (d366 <= i5) return "juli";
        if (d366 <= i6) return "augustus";
        if (d366 <= i7) return "september";
        if (d366 <= i8) return "oktober";
        if (d366 <= i9) return "november";
        if (d366 <= i10) return "december";
        return "geen maand";
    }

    public static int bepaalWelkeDagNummer(int d366,int jaar){
        if (schrikkelJaar(jaar)){
            return getDagNummer(d366, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366);
        } else {
            return getDagNummer(d366, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365);
        }
    }

    private static int getDagNummer(int d366, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (d366 <= 31) return d366;
        if (d366 <= 59) return d366 - 31;
        if (d366 <= i) return d366 - 59;
        if (d366 <= i2) return d366 - i;
        if (d366 <= i3) return d366 - i2;
        if (d366 <= i4) return d366 - i3;
        if (d366 <= i5) return d366 - i4;
        if (d366 <= i6) return d366 - i5;
        if (d366 <= i7) return d366 - i6;
        if (d366 <= i8) return d366 - i7;
        if (d366 <= i9) return d366 - i8;
        if (d366 <= i10) return d366 - i9;
        return 0;
    }
}
