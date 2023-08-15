import java.util.Scanner;

public class Main {	
	
	static void calculaFatorial(int numero) {
		int resultado = numero;
		
		for (int i = numero; i > 1; i--) {
			resultado *= (i - 1);   
		}
		
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = leia.nextInt();
		calculaFatorial(numero);		
		
		leia.close();
	}
}
