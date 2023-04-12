package Poo;

public class TesteEmpregado {

	public static void main(String[] args) {

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Beatriz Angelita",15000);
		lista[1] = new Empregado("Julia Guarnieri",50000);
		lista[2] = new Empregado("Willian Reis",10000);
		
		for(Empregado roda:lista) {
			roda.imprimir();
		}
		
		System.out.println("********************");
		
		for(Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
	}

}
