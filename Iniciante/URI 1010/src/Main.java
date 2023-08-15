import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int codigo1 = leia.nextInt();
		int qtdPeca1 = leia.nextInt();
		float valorPeca1 = leia.nextFloat();
		int codigo2 = leia.nextInt();
		int qtdPeca2 = leia.nextInt();
		float valorPeca2 = leia.nextFloat();		
		float total = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
		
		leia.close();
	}

}
