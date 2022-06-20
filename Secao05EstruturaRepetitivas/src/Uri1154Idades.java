import java.util.Scanner;

public class Uri1154Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int cont = 0;
		int soma = 0;
				
		x = sc.nextInt();
		
		while ( x >= 0) {
			cont = cont + 1;
			soma = soma + x;
			x = sc.nextInt();
		}
		
		double media = (double) soma / cont;
		
		System.out.printf("%.2f%n",media);
		
		sc.close();

	}

}


