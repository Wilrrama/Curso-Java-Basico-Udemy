package URI;

import java.util.Scanner;

public class URI1020IdadeDias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, resto, resultado;
		
		N = sc.nextInt();
	
		resto = N;

		resultado = resto / 365;
		System.out.println(resultado + " ano(s)");
		resto = resto % 365;

		resultado = resto / 30;
		System.out.println(resultado + " mes(es)");
		resto = resto % 30;

		System.out.println(resto + " dia(s)");
						
		sc.close();		
		
	}
	
}
