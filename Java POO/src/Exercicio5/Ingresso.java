package Exercicio5;

import java.text.NumberFormat;

public class Ingresso {

	private String nome;
	private double valor;
	private String data;
	private String cantores;
	private int horario;
	
	public Ingresso(String nome, double valor, String data, String cantores, int horario) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.cantores = cantores;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCantores() {
		return cantores;
	}

	public void setCantores(String cantores) {
		this.cantores = cantores;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public String moeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMaximumFractionDigits(2);
		String moeda = nf.format(valor);
		return moeda;
		
	}
	
	public void imprimir() {
		System.out.println("Evento: "+nome+"\nValor: "+this.moeda()+"\nData: "+data+"\nBandas/Artistas: "+cantores+"\nHorario: "+horario+"H");
	}
	
}
