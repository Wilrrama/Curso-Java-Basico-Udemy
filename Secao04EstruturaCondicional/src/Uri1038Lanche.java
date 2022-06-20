import java.util.Locale;
import java.util.Scanner;

public class Uri1038Lanche {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int qt = sc.nextInt();
		double valor=0;
		
		switch (x) {
		case 1:
			valor = 4 * qt;
			break;
		case 2:
			valor = 4.5 * qt;
			break;
		case 3:
			valor = 5 * qt;
			break;
		case 4:
			valor = 2 * qt;
			break;
		case 5:
			valor = 1.5 * qt;
			break;
		}
		System.out.printf("Total: R$ %.2f%n", valor);				
		sc.close();
	}
}
