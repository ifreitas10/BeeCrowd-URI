import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1_aluno = sc.nextDouble();
		double nota2_aluno = sc.nextDouble();
		double MEDIA = ((nota1_aluno * 3.5) + (nota2_aluno * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		
		sc.close();
	}

}
