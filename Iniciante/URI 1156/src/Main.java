import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double S = 1, x = 1, y = 1;
		
		//S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
		for (x = 3, y = 2; x <= 39; x += 2, y *= 2) {			
			S += x / y;			
		}
		
		System.out.printf("%.2f\n", S);
	}
}
