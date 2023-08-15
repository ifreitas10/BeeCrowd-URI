import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nome = leia.nextLine();
		double salario = leia.nextDouble();
		double vendas = leia.nextDouble();
		double comissao = vendas * 0.15;
		double total = salario + comissao;
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", total));
		
		leia.close();

	}

}
