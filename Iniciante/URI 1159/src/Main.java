import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int X, soma = 0, qtdPar = 0;
		X = leia.nextInt();
		
		while (X != 0) {
			for (int i = X; qtdPar < 5; i++) {
				if (i % 2 == 0) {
					qtdPar++;
					soma += i;
				}				
			}	
			
			System.out.println(soma);
			soma = 0;
			qtdPar = 0;
			X = leia.nextInt();			
		}
		
		leia.close();
	}
}
