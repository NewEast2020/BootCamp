//Dag 2-1: Array Sum
public class ArraySum {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 10, 11};
       int sum=0;
       // assign sum of elements of array arr to variable sum
       for(int k=0; k<arr.length; k++){
	       sum+=arr[k];		   
	   }
	   // print variable sum
	   System.out.println("Sum is : " + sum );		
   }
}