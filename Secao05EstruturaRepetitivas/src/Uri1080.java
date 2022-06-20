import java.util.Scanner;

//Leia 100 valores inteiros. 
//Apresente então o maior valor lido e a 
//posição dentre os 100 valores lidos.
public class Uri1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maior = sc.nextInt();
		int posicao = 1;
		
		for (int i = 2; i <=5; i++) {
			int x = sc.nextInt();
			if ( x > maior) {
				maior=x;
				posicao=i;
			}		
		}		
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
	}

}
