package Exercicio2;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario pessoa1 = new Funcionario("Camille Arrabal",19,"Cozinheira",2800,562132458);
		Funcionario pessoa2 = new Funcionario ("Giovanna Camiri",21,"Publicitaria",2400,345612587);
		
		System.out.println();
		pessoa1.imprimir();
		System.out.println("************************");
		pessoa2.imprimir();

	}

}
