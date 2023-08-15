import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int qtdTeste;
		int X, Y, soma = 0, contImpar = 1, contTeste = 1;		
		
		qtdTeste = leia.nextInt();
		
		do {
			X = leia.nextInt();
			Y = leia.nextInt();
			
			for (int indice = X; contImpar <= Y; indice++) {
				if (indice % 2 != 0) {
					soma += indice;
					contImpar++;
				}
			}
			
			System.out.println(soma);
			contTeste++;
			contImpar = 1;
			soma = 0;
			
		} while (contTeste <= qtdTeste );
		
		leia.close();
	}
}
