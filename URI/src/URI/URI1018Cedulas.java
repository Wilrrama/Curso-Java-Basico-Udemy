package URI;

import java.util.Scanner;

public class URI1018Cedulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, quociente, resto ;

		N = sc.nextInt();
		System.out.println(N);

		resto = N;

		quociente = resto / 100;
		System.out.println(quociente + " nota(s) de R$ 100,00");
		resto = resto % 100;

		quociente = resto / 50;
		System.out.println(quociente + " nota(s) de R$ 50,00");
		resto = resto % 50;

		quociente = resto / 20;
		System.out.println(quociente + " nota(s) de R$ 20,00");
		resto = resto % 20;

		quociente = resto / 10;
		System.out.println(quociente + " nota(s) de R$ 10,00");
		resto = resto % 10;

		quociente = resto / 5;
		System.out.println(quociente + " nota(s) de R$ 5,00");
		resto = resto % 5;

		quociente = resto / 2;
		System.out.println(quociente + " nota(s) de R$ 2,00");
		resto = resto % 2;

		System.out.println(resto + " nota(s) de R$ 1,00");

		sc.close();

	}

}
