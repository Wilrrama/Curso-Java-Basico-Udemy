import java.util.Scanner;

public class Uri1131Grenais {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	int continuar=1;
	int interv=0;
	int gremiov=0;
	int jogos =0;
	int empates=0;
	
	while (continuar == 1) {
		
		int inter = sc.nextInt();
		int gremio = sc.nextInt();
		if ( inter > gremio) {
			interv++;
		} else if ( gremio > inter) {
			gremiov++;
		} else {
			empates++;
		}
		
		System.out.println("Novo grenal (1-sim 2-nao)");
		jogos++;
		continuar = sc.nextInt();
	}
	
	System.out.println(jogos +" grenais");
	System.out.println("Inter:"+ interv);
	System.out.println("Gremio:" +gremiov);
	System.out.println("Empates:"+empates);
	if (interv > gremiov) {
		System.out.println("Inter venceu mais");
	} else if ( gremiov > interv){
		System.out.println("Gremio venceu mais");
	} else {
		System.out.println("Nao houve vencedor");
	}
		
	sc.close();
		
	}

}
