import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] vet = new int [M][N];		
		for (int i=0; i<M;i++) {
			for (int j=0; j<M;j++) {
				vet [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (int i=0; i<M;i++) {
			for (int j=0; j<M;j++) {
			if (vet[i][j]<0) {
				System.out.println(vet[i][j]);
			}
		}
	}			
		sc.close();
	}

}
