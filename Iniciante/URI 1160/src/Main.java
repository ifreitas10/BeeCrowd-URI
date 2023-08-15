import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int T, PA, PB, contAnos;
		double G1, G2;		
		
		T = leia.nextInt();
		
		for (int i = 1; i <= T; i++) {		
			contAnos = 0;
			PA = leia.nextInt();
			PB = leia.nextInt();
			G1 = leia.nextDouble();
			G2 = leia.nextDouble();
			
			while (PB >= PA) {
				PA += (PA * G1) / 100;
				PB += (PB * G2) / 100;
				contAnos++;			

				if (contAnos > 100) {
					break;
				}
			}
			
			if (contAnos > 100) System.out.println("Mais de 1 seculo.");
			else System.out.println(contAnos + " anos.");
		}
		
		leia.close();
	}
}
