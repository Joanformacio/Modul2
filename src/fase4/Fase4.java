package fase4;

import java.util.*;


public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('j');
		meuNom.add('o');
		meuNom.add('a');
		meuNom.add('n');
		
		List<Character> meuCognom = new ArrayList<Character>();
		meuCognom.add('L');
		meuCognom.add('u');
		meuCognom.add('i');
		meuCognom.add('s');
		
		meuNom.add(' ');
		
		meuNom.addAll(meuCognom);
		
		
		for (Character c:meuNom) {
			System.out.print(c);
		}

	}

}
