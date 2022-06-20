package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1009SalarioBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		double fixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double total = (vendas * 15/100) + fixo;
				
		System.out.printf("TOTAL = R$ %.2f%n", total);		
		
		sc.close();
	}
	
}
