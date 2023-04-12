package ExercicioPOO_6;

public class CursoLivre extends Curso{
	
	private String ensino;

	public CursoLivre(String materia, String data, int turma, int horario, int maxalunos, String ensino) {
		super(materia, data, turma, horario, maxalunos);
		this.ensino = ensino;
	}

	public String getEnsino() {
		return ensino;
	}

	public void setEnsino(String ensino) {
		this.ensino = ensino;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Sistema de ensino: "+ensino);
	}

}
