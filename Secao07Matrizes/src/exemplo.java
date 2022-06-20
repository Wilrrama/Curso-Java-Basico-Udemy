import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		int [][] mat = new int [L][C];
		
		for (int l=0; l<L ; l++) {
			for (int c=0; c<C; c++) {
				mat[l][c] = sc.nextInt();
			}
		}		
		for (int l=0; l<L ; l++) {
			for (int c=0; c<C; c++) {
				System.out.print(mat[l][c]+" ");
			}
			System.out.println();
		}		
		sc.close();			
	}
}
