package nivell2;

public class Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char escala[]= new char[5];
		
		for (int i=0; i<5; i++) {
			escala[i]='*';
		}
		
		for (int i=5; i!=0;i--) {
			
			for (int j=0; j<i;j++) {
				System.out.print(escala[j]);
			}
			System.out.println();
		}
		
		
	}

}
