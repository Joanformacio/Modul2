package fase2;
import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('j');
		meuNom.add('o');
		meuNom.add('a');
		meuNom.add('n');
		
		for (char lletra:meuNom) {
			int asciiValor= (int)lletra;
			
			if (asciiValor>=65 && asciiValor<=90){
				
				if (asciiValor==65 || asciiValor==69 || asciiValor==73 || asciiValor==79 || asciiValor==85) {
					System.out.println("La lletra " + lletra + " es una vocal");
				}else{
					System.out.println("La lletra " + lletra + " es una consonant");
				}
					
				
			}else if(asciiValor>96 && asciiValor<123) {
				if (asciiValor==97 || asciiValor==101 || asciiValor==105 || asciiValor==111 || asciiValor==117) {
					System.out.println("La lletra " + lletra + " es una vocal");
				}else{
					System.out.println("La lletra " + lletra + " es una consonant");
				}
			}else if (asciiValor>=48 && asciiValor<=57) {
				System.out.println("La lletra " + lletra + " es un digit");
			}
			
		}
		
	}

}
