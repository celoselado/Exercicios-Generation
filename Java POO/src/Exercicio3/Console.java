package Exercicio3;

public class Console extends Jogos {
	
	private String controles;

	public Console(String nome, String estilo, double preço, String console, int idade, String controles) {
		super(nome, estilo, preço, console, idade);
		this.controles = controles;
	}

	public String getControles() {
		return controles;
	}

	public void setControles(String controles) {
		this.controles = controles;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Multijogador local: "+controles);
	}
	
}
