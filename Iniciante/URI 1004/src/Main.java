import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int PROD = numero1 * numero2;
		
		System.out.println("PROD = " +PROD);
		
		sc.close();

	}

}
