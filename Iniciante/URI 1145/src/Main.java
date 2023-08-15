import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		
		
		int X = leia.nextInt();
		int Y = leia.nextInt();
		
		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			
			if (i % X == 0) {
				System.out.print("\n");				
			} else System.out.print(" ");
		}
		
		leia.close();
	}
}
