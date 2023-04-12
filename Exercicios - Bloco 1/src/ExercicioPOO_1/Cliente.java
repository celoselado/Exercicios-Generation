package ExercicioPOO_1;

public class Cliente {

	private String nome;
	private int idade;
	private int cpf;
	private String endereco;
	private int celular;
	
	public Cliente(String nome, int idade, int cpf, String endereco, int celular) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.celular = celular;
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






	public int getCpf() {
		return cpf;
	}






	public void setCpf(int cpf) {
		this.cpf = cpf;
	}






	public String getEndereco() {
		return endereco;
	}






	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}






	public int getCelular() {
		return celular;
	}






	public void setCelular(int celular) {
		this.celular = celular;
	}






	public void imprimir() {
		System.out.println("Cliente: "+nome+"\nIdade: "+idade+"\nCpf: "+cpf+"\nEndereço: "+endereco+"\nNumero de celular: "+celular+"");
	}
	
	
	
}
