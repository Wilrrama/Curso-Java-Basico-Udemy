import java.util.Scanner;

public class Uri1074ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int n2 = sc.nextInt();
			if (n2 %2 !=0 && n2 > 0) { 
				System.out.println("ODD POSITIVE");
			} else if ( n2 ==0) {
				System.out.println("NULL");
			} else if (n2 % 2 == 0 && n2 > 0){ 
				System.out.println("EVEN POSITIVE");
			} else if (n2 % 2 == 0 && n2 < 0) { 
				System.out.println("EVEN NEGATIVE");
			} else {
				System.out.println("ODD NEGATIVE");
			}
		}		
		
		sc.close();
	}
}