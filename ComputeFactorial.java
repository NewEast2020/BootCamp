// dag 1-9
public class ComputeFactorial {
   public static void main(String[] args) {
       int number = 9;
       int fact = 1;
       for(int k=1; k<=number; k++){
		   fact*=k;		 
	   }
	   System.out.println("Factorial of " + number + " is: " + fact + ".");
   }
}