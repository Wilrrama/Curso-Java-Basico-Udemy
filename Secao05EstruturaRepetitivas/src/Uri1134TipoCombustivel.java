import java.util.Scanner;

public class Uri1134TipoCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int alc=0;
		int gas=0;
		int diel=0;
		int x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alc = alc+1;
			}else if ( x==2) {
				gas = gas+1;
			} else if ( x==3) {
				diel = diel+1;
			}
			x = sc.nextInt();			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+diel);
		
		sc.close();	
		
	}

}
