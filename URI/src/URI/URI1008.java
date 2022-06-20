package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double receber = horas * valorHora;
		
		System.out.println("NUMBER = "+numero);
		System.out.printf("SALARY = U$ %.2f%n",receber);
		
		sc.close();
		}
}
