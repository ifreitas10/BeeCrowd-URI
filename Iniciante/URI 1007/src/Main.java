import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A = leia.nextInt();
		int B = leia.nextInt();
		int C = leia.nextInt();
		int D = leia.nextInt();
		
		int DIFERENCA = A * B - C * D;
		System.out.printf("DIFERENCA = %d\n" , DIFERENCA);
		
		leia.close();

	}

}
