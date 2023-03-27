package Exercicio4;

public class Medicamento extends Farmacia {
	
	private String bula;

	public Medicamento(String nome, int comprimidos, int idade, int peso, double preço, String bula) {
		super(nome, comprimidos, idade, peso, preço);
		this.bula = bula;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Bula necessária: "+bula);
		
	}

}
