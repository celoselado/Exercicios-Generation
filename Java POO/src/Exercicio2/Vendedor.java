package Exercicio2;

public class Vendedor extends Funcionario {
	
	private int vendas;

	public Vendedor(String nome, int idade, String area, double salario, int cpf, int vendas) {
		super(nome, idade, area, salario, cpf);
		this.vendas = vendas;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Vendas no mes: "+vendas);
	}

}
