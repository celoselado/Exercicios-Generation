package ExercicioPOO_5;

public class Vip extends Ingresso{

	private int primeiros;

	public Vip(String nome, double valor, String data, String cantores, int horario, int primeiros) {
		super(nome, valor, data, cantores, horario);
		this.primeiros = primeiros;
	}

	public int getPrimeiros() {
		return primeiros;
	}

	public void setPrimeiros(int primeiros) {
		this.primeiros = primeiros;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Vip para as primeiras: "+primeiros+" pessoas!");
	}
	
	
	
}
