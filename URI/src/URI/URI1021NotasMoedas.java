package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1021NotasMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		double notas = (int) valor / 100;
		
		System.out.println("NOTAS:");
		
		int quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 100.00");
		double resto = valor % 100;
			
		notas  = (int) resto / 50;
		quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 50.00");
		resto = resto % 50;
		
		notas = (int) resto / 20;
		quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 20.00");
		resto = resto %20;
		
		notas = (int) resto /10;
		quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 10.00");
		resto = resto %10;
			
		notas = (int) resto /5;
		quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 5.00");
		resto = resto %5;
		
		notas = (int) resto /2;
		quo = (int)notas;
		System.out.println(quo + " nota(s) de R$ 2.00");
		resto = resto %2;
		
		System.out.println("MOEDAS:");
		
		notas = (int) resto /1;
		quo = (int)notas;
		System.out.println(quo + " moeda(s) de R$ 1.00");
		resto = resto %1;
		
		double moeda = 0.50;
	    notas = (int) resto /moeda;
	    quo = (int)notas;
	    System.out.println(quo + " moeda(s) de R$ 0.50");
		resto = resto %0.5;
		
		notas = (int) resto /0.25;
		quo = (int)notas;
		System.out.println(quo + " moeda(s) de R$ 0.25");
		resto = resto % 0.25;
		
		notas = (int) resto / 0.10;
		quo = (int)notas;
		System.out.println(quo + " moeda(s) de R$ 0.10");
		resto = resto % 0.10;
		
		notas = (int) resto / 0.05;
		quo = (int)notas;
		System.out.println(quo + " moeda(s) de R$ 0.05");
		resto = resto % 0.05;
		
		notas = (int) resto / 0.01;
		quo = (int)notas;
		System.out.println(quo + " moeda(s) de R$ 0.01");
		resto = resto % 0.01;
		
		sc.close();
		
		
	}
}
