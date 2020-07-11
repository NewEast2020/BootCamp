// dag 1-7
public class ReverseString {
   public static void main(String[] args) {
       String str = "Ik programmeer Java!";
       String reverse ="";
       System.out.println(str);
	   // reverse = omgekeerde van str
	   for(int k=str.length()-1; k>=0; k--){
		   reverse+=str.charAt(k);
	   }
       // print reverse
	   System.out.println(reverse);
   }
}

