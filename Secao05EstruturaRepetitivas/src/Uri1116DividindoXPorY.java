import java.util.Locale;
import java.util.Scanner;

public class Uri1116DividindoXPorY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
				
		for (int i=1; i <= n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
						
			double soma = a/b;	
			
			if (b==0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n",soma);
			}
						
		}				
		sc.close();
	}
}