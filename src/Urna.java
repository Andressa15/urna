import java.util.Scanner;

public class Urna {

	String nome;
	int numero;
	int voto;



	public Urna(String nome, int numero, int voto) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.voto = voto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public String toString() {
		String modelo = "";

		modelo += " Nome _->" + this.getNome() + "\n";
		modelo += " numero do candidato ->"+ this.getNumero()+ "\n";
		modelo += " quantidades de votos ->"+ this.getVoto()+"\n";

		return modelo;










	}
}
