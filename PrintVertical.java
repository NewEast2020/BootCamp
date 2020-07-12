// dag 1-8
public class PrintVertical{
   public static void main(String[] args) {
       String org = "Bruine bloemen!";
       // Print String org met een letter per regel
	   for (int k=0; k<org.length(); k++){
		   System.out.print(org.charAt(k));
		   // De karakters a, o, i, u, e worden gevolgd door een *
		   if(org.charAt(k)=='a' || org.charAt(k)=='o' || org.charAt(k)=='i' || org.charAt(k)=='u' || org.charAt(k)=='e'){
			   System.out.print("*");
		   }
		   System.out.println("");
	   }

   }
}