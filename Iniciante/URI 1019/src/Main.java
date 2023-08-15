import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int duracao = sc.nextInt();
		int horas;
		int minutos;
		int segundos;
		
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = duracao % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
