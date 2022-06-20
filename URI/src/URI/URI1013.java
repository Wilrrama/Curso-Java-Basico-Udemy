package URI;

import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorab = (a+b+Math.abs(a-b))/2;
		
		int maior = (maiorab + c + Math.abs(maiorab - c))/2;
		
		System.out.printf(maior+" eh o maior%n");
		
		sc.close();
	}
	
}
