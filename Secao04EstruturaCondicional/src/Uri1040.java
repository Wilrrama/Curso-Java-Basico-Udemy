import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
		
	float a, b, c, d;
	
	a = sc.nextFloat();
	b = sc.nextFloat();
	c = sc.nextFloat();
	d = sc.nextFloat();
		
	float media = (a*2f+ b*3f + c*4f + d*1f) / 10f;
	System.out.printf("Media: %.1f%n", media);
	
	if (media >= 7f) {
		System.out.println("Aluno aprovado.");
	}
	else if (media < 5f) {
		System.out.println("Aluno reprovado.");
	}
	else {
		
	}
	
	sc.close();

	}

}
