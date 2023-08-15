import java.util.Locale;
import java.util.Scanner;

public class Main {		

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		AlunoT aluno = new AlunoT();
		int n = leia.nextInt();
		double medias[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			aluno.nota1 = leia.nextDouble();
			aluno.nota2 = leia.nextDouble();
			aluno.nota3 = leia.nextDouble();
			aluno.media = ((aluno.nota1 * 2) + (aluno.nota2 * 3) + (aluno.nota3 * 5)) / 10;
			medias[i] = aluno.media;
		}
		
		for(double x : medias) System.out.printf("%.1f\n", x);			
		
		leia.close();
	}
}
