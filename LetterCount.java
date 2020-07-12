// dag 1-4
class LetterCount{
	public static void main(String[] args) {
		String org = "Deze regel heeft best wel veel eees.";
		int res = 0;
		for(int k=0; k<org.length(); k++){
			if(org.charAt(k)=='e'){
				res++;
			}
		}
		System.out.println("Letter e komt in string org " + res + " keer voor." );
	}		 
}