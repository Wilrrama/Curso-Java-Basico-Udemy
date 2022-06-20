import java.util.Scanner;

public class Uri1143QuadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int inicio=1;
		
		for (int i = 1 ; i <= n; i++) {
			
			int segundo = (int) Math.pow(inicio, 2);
			int terceiro = (int) Math.pow(inicio, 3);
			System.out.printf("%d %d %d %n", inicio, segundo, terceiro);
			inicio=inicio+1;			
		}		
		
		sc.close();
	}
}
