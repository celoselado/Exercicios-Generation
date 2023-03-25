package Exercicio6;

public class Curso {

	private String materia;
	private String data;
	private int turma;
	private int horario;
	private int maxalunos;
	
	public Curso(String materia, String data, int turma, int horario, int maxalunos) {
		super();
		this.materia = materia;
		this.data = data;
		this.turma = turma;
		this.horario = horario;
		this.maxalunos = maxalunos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int getMaxalunos() {
		return maxalunos;
	}

	public void setMaxalunos(int maxalunos) {
		this.maxalunos = maxalunos;
	}
	
	public void imprimir() {
		System.out.println("Matéria: "+materia+"\nData: "+data+"\nTurma: "+turma+"\nHorario de inicio: "+horario+"H"+"\nMáximo de alunos: "+maxalunos);
	}
	
}
