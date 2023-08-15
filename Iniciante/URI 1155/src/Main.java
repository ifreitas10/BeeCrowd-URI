import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double S = 1.00;
		
		for (int i = 2; i <= 100; i++) {
			S += 1.00 / i;			
		}
		System.out.printf("%.2f\n" , S);
	}
}
