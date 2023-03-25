package Exercicio1;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente pessoa1 = new Cliente("Lucas Pereira",18,489909832,"Rua Balsas 65",940124780);
		Cliente pessoa2 = new Cliente("Vitor Alexandre",22,42123645,"Rua Moraris 43",912456313);
		
		System.out.println();
		pessoa1.imprimir();
		System.out.println("*************************");
		pessoa2.imprimir();

	}

}
