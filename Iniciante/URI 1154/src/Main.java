import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, soma = 0, cont = 0;		
		double media = 0;
		
		while ((idade = leia.nextInt()) > 0) {
			soma += idade;
			cont++;			
		}
		
		media = (double)soma / (double)cont;
		System.out.printf("%.2f\n" , media);
		
		leia.close();
	}
}
