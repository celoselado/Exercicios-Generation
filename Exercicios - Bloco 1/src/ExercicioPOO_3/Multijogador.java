package ExercicioPOO_3;

public class Multijogador extends Jogos {
	
	private String online;

	public Multijogador(String nome, String estilo, double preço, String console, int idade, String online) {
		super(nome, estilo, preço, console, idade);
		this.online = online;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Multijogador: "+online);
	}

}
