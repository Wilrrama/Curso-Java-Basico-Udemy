import java.util.Scanner;

public class Uri1046TempoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int dura;
		
		if ( inicio < fim ) {
			dura = fim - inicio;
		} else {
			dura = 24 - inicio + fim;
		}
		System.out.println("O JOGO DUROU "+ dura + " HORA(S)");				
		sc.close();
	}
}
