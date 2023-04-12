package ExercicioPOO_1;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente pessoa1 = new Cliente("Lucas Pereira",18,489909832,"Rua Balsas 65",940124780);
		Cliente pessoa2 = new Cliente("Vitor Alexandre",22,42123645,"Rua Moraris 43",912456313);
		PessoaJuridica pessoa3 = new PessoaJuridica("Marcelo Macedo",33,45231536,"Rua dos Alexandres 47",15456321,"452214632");
		PessoaFisica pessoa4 = new PessoaFisica("Ahlevo Pereira",17,25463121,"Rua Mendo Paulino 47",13254151,"10/11/2003");
		
		
		System.out.println();
		pessoa1.imprimir();
		System.out.println("*************************");
		pessoa2.imprimir();
		System.out.println("*************************");
		pessoa3.imprimir();
		System.out.println("*************************");
		pessoa4.imprimir();

	}

}
