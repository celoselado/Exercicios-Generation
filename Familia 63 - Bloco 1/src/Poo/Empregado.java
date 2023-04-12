package Poo;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatarMoeda = nf.format(salario);
		return formatarMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+" ganha um salário de: "+this.formatarMoeda());
		
	}
	
	
	
}
