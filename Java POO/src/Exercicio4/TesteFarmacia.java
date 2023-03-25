package Exercicio4;

public class TesteFarmacia {

	public static void main(String[] args) {

		Farmacia remedio1 = new Farmacia("Nebacetin",15,16,20,56);
		Farmacia remedio2 = new Farmacia("Minoxidil",10,20,18,34);

		System.out.println();
		remedio1.imprimir();
		System.out.println("****************");
		remedio2.imprimir();
	}

}
