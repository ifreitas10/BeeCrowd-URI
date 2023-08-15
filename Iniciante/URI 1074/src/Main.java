import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int N, qtdN = leia.nextInt();
		
		for (int i = 0; i < qtdN; i++) {
			
			N = leia.nextInt();
			
			if (N == 0) {
				
				System.out.println("NULL");
				continue;
			}
			
			if (N % 2 == 0) {
				
				if (N > 0) {
					
					System.out.println("EVEN POSITIVE");
					
				}
				else {
					
					System.out.println("EVEN NEGATIVE");
				}
			}
			else {
				
				if (N > 0) {
					System.out.println("ODD POSITIVE");
				}
				else {
					System.out.println("ODD NEGATIVE");
				}
			}
			
		}
		
		leia.close();

	}

}
