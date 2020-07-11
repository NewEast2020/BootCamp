// dag 1-5
import java.util.Scanner;

public class CheckWachtwoord {
   public static void main(String[] args) {
       String wachtwoord = "java";
       // define Scanner
       Scanner sc = new Scanner(System.in);
       // read input
       String input;
	   System.out.println("Voer wachtwoord in : " );
       input = sc.nextLine();
       // check wachtwoord
       if(input.equals(wachtwoord)){
		   System.out.println("Wachtwoord is OK: " + input);
	   } else {
		   System.out.println("Wachtwoord is fout: " + input);
	   }			
   }
}