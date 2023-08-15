import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int N, soma = 0;
		
		N = sc.nextInt();
		
		while(N < 1) {
			N = sc.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			soma += A;
			A++;
		}
		System.out.println(soma);		
		sc.close();
	}
}
