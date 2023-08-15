import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int X, count, N;
		
		N = leia.nextInt();
		
		for (int i = 0; i < N; i++) {
			count = 0;
			X = leia.nextInt();
			
			for (int j = 2; j < X; j++) {
				if (X % j == 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(X + " nao eh primo");
			}
			else System.out.println(X + " eh primo");
			
		}
		leia.close();
	}
}
