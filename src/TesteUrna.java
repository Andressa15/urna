import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteUrna {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Urna> listaCandidatos = new ArrayList<Urna>();


		for (int controle = 0; controle < 11; controle ++) {
			System.out.println(" Qual é o nome do candidato?");
			String nome = scan.next();
			System.out.println(" Qual é numero do candidato");
			int numero = scan.nextInt();
			listaCandidatos.add(new Urna(nome, numero, 0));
		

		for (Urna candidato : listaCandidatos) {
	int encerra = 10 ;
		    
			 	candidato.setVoto (candidato.getVoto()+ 1);
				System.out.println(" voto" + candidato.getNome());
				if ( candidato.getVoto() >= encerra) {
					System.out.println( " votação encerreda");
				}
			}
		
		 
		}



	}	
}
