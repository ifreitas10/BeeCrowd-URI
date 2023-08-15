import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int h1, m1, h2, m2, hm1, hm2, resultado, H24;
		
		h1 = leia.nextInt();
		m1 = leia.nextInt();
		h2 = leia.nextInt();
		m2 = leia.nextInt();
		
		hm1 = (h1 * 60) + m1;
		hm2 = (h2 * 60) + m2;
		H24 = 24 * 60;
		resultado = 0;
		
		if (hm2 > hm1) {
			resultado = hm2 - hm1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n" , (resultado / 60) , (resultado % 60));
		}
		else if (hm1 > hm2) {
			resultado =  (H24 - hm1) + hm2;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n" , (resultado / 60) , (resultado % 60));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n" , 24 , 0);
		}
		
		leia.close();
		
	}

}
