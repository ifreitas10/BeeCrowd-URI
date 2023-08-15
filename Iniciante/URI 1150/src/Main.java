import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, cont = 0;
		int X = sc.nextInt();
		int Z = sc.nextInt();
		
		while (Z <= X) {
			Z = sc.nextInt();
		}
		
		for (int i = X; i < Z; i++) {
			soma += i;
			cont++;
			if (soma > Z) {
				System.out.println(cont);
				break;
			}
		}
		
		sc.close();
	}
}
