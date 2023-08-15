import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N, i = 0, j = 1, cont = 1, soma = 0;
		
		N = leia.nextInt();
		
		System.out.print(i + " " + j);
		while (cont < N - 1) {			
			soma = i + j;
			System.out.print(" " + soma);
			i = j;
			j = soma;			
			cont++;			
		}
		System.out.println();
		leia.close();
	}
}
