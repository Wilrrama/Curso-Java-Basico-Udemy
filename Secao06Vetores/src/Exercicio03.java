import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	//Fazer um programa para ler um número N, depois nome (apenas uma
	//palavra sem espaços), idade e altura de N pessoas, conforme exemplo.
	//Depois, mostrar na tela a altura média das pessoas, e mostrar também a
	//porcentagem de pessoas com menos de 16 anos
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[]nomes=new String [n];
		int[]idades=new int [n];
		double[]alturas = new double [n];
		
		for(int i=0; i<n;i++) {
			nomes[i]=sc.next();
			idades[i]=sc.nextInt();
			alturas[i]=sc.nextDouble();
		}	
		
		double soma =0.0;
		for (int i=0;i<n;i++) {
			soma = soma + alturas[i];
		}
		double media = soma / n;
		System.out.printf("Altura media: %.2f%n",media);
		
		int cont = 0;
		for (int i=0;i<n;i++) {
			if (idades [i] < 16) {
				cont = cont +1;
			}
		}
		
		double x = cont *100.0 /n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",x);		
		
		sc.close();			
	}

}
