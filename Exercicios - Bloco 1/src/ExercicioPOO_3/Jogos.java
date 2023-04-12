package ExercicioPOO_3;

import java.text.NumberFormat;

public class Jogos {

	private String nome;
	private String estilo;
	private double preço;
	private String console;
	private int idade;
	
	public Jogos(String nome, String estilo, double preço, String console, int idade) {
		super();
		this.nome = nome;
		this.estilo = estilo;
		this.preço = preço;
		this.console = console;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String Moeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String Moeda = nf.format(preço);
		return Moeda;
	
	}
	
	public void imprimir() {
		System.out.println("Nome do jogo: "+nome+"\nEstilo: "+estilo+"\nValor: "+this.Moeda()+"\nPlataforma: "+console+"\nRecopmendado para maiores de: "+idade+" anos");
	}
	

}
