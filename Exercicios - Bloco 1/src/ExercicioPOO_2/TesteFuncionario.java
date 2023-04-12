package ExercicioPOO_2;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario pessoa1 = new Funcionario("Camille Arrabal",19,"Cozinheira",2800,562132458);
		Funcionario pessoa2 = new Funcionario ("Giovanna Camiri",21,"Publicitaria",2400,345612587);
		Gerente pessoa3 = new Gerente("Lucca Santos",22,"Gerente de vendas",5000,3458452,8);
		Vendedor pessoa4= new Vendedor("Viego Golçaves",34,"Caixa",3100,4587456,78);
		
		
		System.out.println();
		pessoa1.imprimir();
		System.out.println("************************");
		pessoa2.imprimir();
		System.out.println("*************************");
		pessoa3.imprimir();
		System.out.println("*************************");
		pessoa4.imprimir();

	}

}
