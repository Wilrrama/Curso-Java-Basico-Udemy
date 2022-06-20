import java.util.Scanner;

public class Uri1072Intervalo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int in=0;
		int out=0;
		
		int n = sc.nextInt();
		for (int i =0; i<n; i++) {
			int n2 = sc.nextInt();
			if (n2 >=10 && n2 <=20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
