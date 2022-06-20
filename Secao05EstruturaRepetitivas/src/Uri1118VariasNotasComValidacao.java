import java.util.Locale;
import java.util.Scanner;

public class Uri1118VariasNotasComValidacao {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double a = 0.0;
			double b = 0.0;
			double media = 0.0;
			int continuar=1;
			
			
			while(continuar == 1) {
									
			a = sc.nextDouble();			
			while ( a < 0.0 || a > 10.0) {
				System.out.println("nota invalida");
				a = sc.nextDouble();
				}
					
			b = sc.nextDouble();
			while ( b < 0.0 || b > 10.0) {
				System.out.println("nota invalida");
				b = sc.nextDouble();
				}
			
			media = (a + b) / 2.0;
			System.out.printf("media = %.2f%n", media);
			
		
			System.out.println("novo calculo (1-sim 2-nao)");
			continuar = sc.nextInt();
			
				while ( continuar !=1 && continuar !=2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				continuar = sc.nextInt();
			}
			
			}
			sc.close();
		}
			
	}

