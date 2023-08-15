import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		while((N = sc.nextInt()) != 0) {
			for (int i = 1; i <= N; i++) {
				if (i == N) System.out.println(i);				
				else System.out.print(i + " ");
			}			
		}		
		sc.close();
	}
}
