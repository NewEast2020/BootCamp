public class kaartspel{
	public static void main(String[] args) {
		String soort= "";
		String kleur= "";
		for(int j=0; j<4; j++){
			switch(j){
				case 0:  soort ="Schoppen"; kleur = "Zwart"; break;
				case 1:  soort ="Ruiten"  ; kleur = "Rood";  break;
				case 2:  soort ="Harten"  ; kleur = "Rood";  break;
				default: soort ="Klaveren"; kleur = "Zwart"; break;
			}	    

			for(int i=1; i<14; i++){
				System.out.print(soort + " ");
				switch(i){
					case 1 :System.out.print("Aas");  break;
					case 11:System.out.print("Boer"); break;
					case 12:System.out.print("Vrouw");break;
					case 13:System.out.print("Heer"); break;
					default: System.out.print(i);
				}
				System.out.println(" " + kleur);
			}
		}
	}
}
