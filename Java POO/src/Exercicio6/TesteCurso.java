package Exercicio6;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso turma1 = new Curso("Ciências da Computação","27/03/2023",1,16,20);
		Curso turma2 = new Curso("Biologia","24/05/2023",2,14,25);
		
		System.out.println();
		turma1.imprimir();
		System.out.println("*********************************");
		turma2.imprimir();

	}

}
