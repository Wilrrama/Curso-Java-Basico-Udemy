package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double media = (B * 7.5 + A * 3.5)/11;		
			
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
		
	}	
	
}
