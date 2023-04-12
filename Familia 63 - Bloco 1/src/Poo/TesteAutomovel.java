package Poo;

public class TesteAutomovel {

	public static void main(String[] args) {

		
		//Criando um objeto a partir da classe criada.
		Automovel auto1 = new Automovel("Bruna","Kombi","MBO2321",1989);
		
		auto1.imprimir();
		
		System.out.println("\nDigite o nome de um novo proprietario: ");
		auto1.setNomeProprietario("Larissa Pimenta");
		
		auto1.imprimir();
		
		System.out.println("\nDigite a nova placa: ");
		
		auto1.setPlaca("NDL2523");
		
		auto1.imprimir();

	}

}
