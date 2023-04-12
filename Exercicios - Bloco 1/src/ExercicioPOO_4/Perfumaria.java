package ExercicioPOO_4;

public class Perfumaria extends Farmacia {
	
	private String cabelo;


	public Perfumaria(String nome, int idade, double preço, String cabelo) {
		super(nome, idade, preço);
		this.cabelo = cabelo;
	}



	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}
	
	public void imprimir() {
		super.imprimir2();
		System.out.println("Produto para cabelo: "+cabelo);
	}

}
