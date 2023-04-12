package ExercicioPOO_5;

public class Meia extends Ingresso {
	
	private String categoria;

	public Meia(String nome, double valor, String data, String cantores, int horario, String categoria) {
		super(nome, valor, data, cantores, horario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Meia entra para: "+categoria);
	}
	
}
