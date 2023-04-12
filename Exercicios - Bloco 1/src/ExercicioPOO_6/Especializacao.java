package ExercicioPOO_6;

public class Especializacao extends Curso{
	
	private String especializacao;

	public Especializacao(String materia, String data, int turma, int horario, int maxalunos, String especializacao) {
		super(materia, data, turma, horario, maxalunos);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Especialização: "+especializacao);
	}

}
