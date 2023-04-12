package ExercicioPOO_2;

public class Gerente extends Funcionario{
	
	private int reunioes;

	public Gerente(String nome, int idade, String area, double salario, int cpf, int reunioes) {
		super(nome, idade, area, salario, cpf);
		this.reunioes = reunioes;
	}

	public int getReunioes() {
		return reunioes;
	}

	public void setReunioes(int reunioes) {
		this.reunioes = reunioes;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Presença em: "+reunioes+" reuniões.");
	}

}
