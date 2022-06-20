package URI;

import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		
		int time = km *2;
		
		System.out.printf("%d minutos%n", time);
		
		sc.close();
	}
}
