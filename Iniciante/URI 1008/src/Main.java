import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		int numeroFuncionario = leia.nextInt();
		int horaTrabalhada = leia.nextInt();
		double valorHoraTrabalhada = leia.nextDouble();
		double salario = (horaTrabalhada * valorHoraTrabalhada);
		
		System.out.println("NUMBER = " +numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		leia.close();

	}

}
