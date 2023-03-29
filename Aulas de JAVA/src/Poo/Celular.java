package Poo;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int numToques) {
		switch(numToques) {
		case 1:
			System.out.println("Pin pin pin");
			break;
		case 2:
			System.out.println("Io Io Io");
			break;
			default:
				System.out.println("Ta tananana tananana");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular...");
	}

}