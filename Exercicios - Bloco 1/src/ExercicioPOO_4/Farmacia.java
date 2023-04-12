package ExercicioPOO_4;

import java.text.NumberFormat;

public class Farmacia {

	private String nome;
	private int comprimidos;
	private int idade;
	private int peso;
	private double preço;
	
	public Farmacia(String nome, int comprimidos, int idade, int peso, double preço) {
		super();
		this.nome = nome;
		this.comprimidos = comprimidos;
		this.idade = idade;
		this.peso = peso;
		this.preço = preço;
	}
	
	

	public Farmacia(String nome, int idade, double preço) {
		this.nome = nome;
		this.idade = idade;
		this.preço = preço;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getComprimidos() {
		return comprimidos;
	}

	public void setComprimidos(int comprimidos) {
		this.comprimidos = comprimidos;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getRecomendado() {
		return preço;
	}

	public void setRecomendado(double preço) {
		this.preço = preço;
	}
	
	public String moeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String moeda = nf.format(preço);
		return moeda;
		
	}
	
	public void imprimir() {
		System.out.println("Remédio: "+nome+"\nA partir de: "+idade+" anos"+"\nQuantidade: "+peso+"g"+"\nQuantidade em comprimidos: "+comprimidos+"\nValor: "+this.moeda());
	}
	
	public void imprimir2() {
		System.out.println("Produto: "+nome+"\nA partir de: "+idade+" anos"+"\nValor: "+this.moeda());
	}
	
}
