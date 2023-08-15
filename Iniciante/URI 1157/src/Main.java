import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N = leia.nextInt();
		
		for (int indice = 1; indice <= N; indice++) {
			if (N % indice == 0) {
				System.out.println(indice);
			}
		}		
		leia.close();
	}
}
