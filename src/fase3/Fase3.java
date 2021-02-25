package fase3;

import java.util.*;


public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> nomMap = new HashMap<Character, Integer>();
		
		
		List<Character> meuNom= new ArrayList<Character>();
		meuNom.add('j');
		meuNom.add('o');
		meuNom.add('a');
		meuNom.add('n');
		
		for (char lletra:meuNom) {
			int count=0;
			char auxChar=lletra;
			for(char c:meuNom) {
				if (auxChar==c) {
					count++;
				}
			}
			if(!nomMap.containsKey(lletra)) {
				nomMap.put(lletra,count);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : nomMap.entrySet()) {
		    System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
		}
		
	
	}
}


