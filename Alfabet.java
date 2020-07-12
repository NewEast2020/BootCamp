// dag 1-10
import java.util.Scanner;
public class Alfabet {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       String alfabet="abcdefghijklmnopqrstuvwxyz";
	   int  teller = 0;
	   // Schrijf hier je code
	   boolean alfabetBezig= true;
	   System.out.println("Voer een letter in");
	   while(alfabetBezig){
		    char input = sc.nextLine().charAt(0);
		    if (input==alfabet.charAt(teller)){
				System.out.println("OK ");
				teller++;
				if (teller==26){
					alfabetBezig=false;
				}
			} else {
			    System.out.println("FOUT");
			} 							
	   }
	   System.out.println("klaar! ");
   }
}   