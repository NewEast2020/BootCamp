// dag 1-3
import java.util.Scanner;

public class VergelijkMetZes {
   public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
	   int cijfer = 6;
	   System.out.print("Voer getal in: ");
	   int input = Integer.parseInt(reader.nextLine());
	   if (cijfer>input){
		   System.out.print("hoger");
	   }
	   else if (cijfer==input){
		   System.out.print("gelijk");
	   }
	   else{
		   System.out.print("lager");
	   }
   }
}

