package nivell1;

public class Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escala[]= new int[5];
		
		for (int i=0; i<5;i++) {
			escala[i]=i+1;
			for (int j=0; j<=i; j++) {
				System.out.print(escala[j]);
			}
			System.out.println();
		}
		
	}

	 
}
