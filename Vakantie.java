import java.util.ArrayList;
import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {
        ArrayList <String> arrl = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ik ga op vakantie en neem mee....");
        String input ="";

        inputLeesWoord(arrl, reader, input);
    }

    private static void inputLeesWoord(ArrayList<String> arrl, Scanner reader, String input) {
        while (!input.equals("Quit")){
           input= reader.nextLine();
           arrl.add(input);
           if (arrl.size()==1){
               System.out.println("Gezegd is: " + arrl.get(0));
           }
           if (arrl.size()>1) {
               arraySizeGroterDanEen(arrl);
           }
        }
    }

    private static void arraySizeGroterDanEen(ArrayList<String> arrl) {
        int indexLast = arrl.size()-2;
        int indexInput = arrl.size()-1;
        String wordLast = arrl.get(indexLast);
        String wordInput = arrl.get(indexInput);
        char charWordLast = wordLast.charAt(wordLast.length()-1);
        char charWordInput = wordInput.charAt(0);

        if (charWordLast!=charWordInput){
            inputIsFout(arrl, indexInput);
        } else{
            inputIsGoed(arrl);
        }
    }

    private static void inputIsGoed(ArrayList<String> arrl) {
        System.out.print("Gezegd is: ");
        for (int k=0; k<arrl.size();k++ ){
            System.out.print(arrl.get(k) );
            if (k!=arrl.size()-1) System.out.print(",");
        }
        System.out.println(" ");
    }

    private static void inputIsFout(ArrayList<String> arrl, int indexInput) {
        arrl.remove(indexInput);
        System.out.println("Fout");
    }
}
