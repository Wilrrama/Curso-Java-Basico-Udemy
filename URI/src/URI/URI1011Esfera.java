package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1011Esfera {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		int valor = sc.nextInt();
		
		double volume = (4.0/3) * pi * (Math.pow(valor, 3));
		
		System.out.printf("VOLUME = %.3f%n", volume);		
		
		sc.close();		
		
	}
}
