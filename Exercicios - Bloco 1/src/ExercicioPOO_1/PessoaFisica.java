package ExercicioPOO_1;

public class PessoaFisica extends Cliente{
	
	private String nasciemento;

	public PessoaFisica(String nome, int idade, int cpf, String endereco, int celular, String nasciemento) {
		super(nome, idade, cpf, endereco, celular);
		this.nasciemento = nasciemento;
	}

	public String getNasciemento() {
		return nasciemento;
	}

	public void setNasciemento(String nasciemento) {
		this.nasciemento = nasciemento;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Data de nascimento: "+nasciemento);
	}

}
