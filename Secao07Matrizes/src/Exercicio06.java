import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		double [][] mat = new double[n][n];
		
		for( int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				mat[i][j]=sc.nextDouble();				
			}
		}
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		double soma = 0;
		for( int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] > 0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);
		
		//	b) imprimir os elementos da linha escolhida			
		
		System.out.print("LINHA ESCOLHIDA: ");
		for ( int j=0; j<n;j++) {
			System.out.printf("%.1f", mat[linha][j]);
		}
		
		System.out.println();
		// c) imprimir os elementos da coluna escolhida
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f", mat[i][coluna]);
		}
		System.out.println();
		
		// d) imprimir a diagonal principal
				System.out.print("DIAGONAL PRINCIPAL: ");
				for (int i=0; i<n; i++) {
					System.out.printf("%.1f ", mat[i][i]);
				}
				System.out.println();

				// e) alterar a matriz elevando os negativos ao quadrado
				for (int i=0; i<n; i++) {
					for (int j=0; j<n; j++) {
						if (mat[i][j] < 0.0) {
							mat[i][j] = mat[i][j] * mat[i][j];
						}
					}
				}
				System.out.println("MATRIZ ALTERADA:");
				for (int i=0; i<n; i++) {
					for (int j=0; j<n; j++) {
						System.out.printf("%.1f ", mat[i][j]);
					}
					System.out.println();
				}
		
		
		sc.close();
		
	}
		
}
