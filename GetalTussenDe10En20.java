
import java.util.Scanner;

public class GetalTussenDe10En20 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Hallo, vanuit Intelli");
        int getal;

        System.out.println("Geef getal: ");
        getal = reader.nextInt();
        geefGetal(getal);
        boolean uitkomst = isGetalTussenDe10En20(10,20,getal);
        System.out.println("getal: " + getal );
        System.out.println("Tussen 10 en 20 ? "+ uitkomst );
    }
    public static int geefGetal(int getal){
        return getal;
    }

    public static boolean isGetalTussenDe10En20(int begin, int eind, int waarde){
        if ( waarde < 10 || waarde > 20){
            return false;
        } else {
            return true;
        }
        // return (waarde >= 10 && waarde <= 20); alternatief
    }
}
