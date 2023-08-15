import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N = 0, X, somaXPerfeito = 0;
		
		//N = leia.nextInt();
		
		while (N < 1 || N > 20) {
			N = leia.nextInt();
			for (int i = 1; i <= N; i++) {
				X = leia.nextInt();
				
				for (int j = 1; j < X; j++) {
					if (X % j == 0) {
						somaXPerfeito += j;
					}
				}
				if (somaXPerfeito == X) System.out.println(X + " eh perfeito");
				else System.out.println(X +" nao eh perfeito");
				
				somaXPerfeito = 0;
			}
		}
		
		leia.close();
	}
}
