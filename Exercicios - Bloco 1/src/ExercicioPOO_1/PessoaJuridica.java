package ExercicioPOO_1;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;

	public PessoaJuridica(String nome, int idade, int cpf, String endereco, int celular, String cnpj) {
		super(nome, idade, cpf, endereco, celular);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Cnpj: "+cnpj);
	}

}
