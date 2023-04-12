package ExercicioPOO_2;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private int idade;
	private String area;
	private double salario;
	private int cpf;
	
	public Funcionario(String nome, int idade, String area, double salario, int cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.area = area;
		this.salario = salario;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String funcaoMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String funcaoMoeda = nf.format(salario);
		return funcaoMoeda;
		
	}
	
	public void imprimir() {
		System.out.println("Funcionario: "+nome+"\nIdade: "+idade+"\nArea: "+area+"\nSalario: "+this.funcaoMoeda()+"\nCPF: "+cpf);
	}
	
	
	
}
