package Exercicio3;

public class TesteJogos {

	public static void main(String[] args) {

		Jogos jogo1 = new Jogos("Undertale","Aventura",38,"Todas as plataformas",13);
		Jogos jogo2 = new Jogos("The Last Of Us","Sobrevivência",300,"Disponível para PS4",18);
		
		System.out.println();
		jogo1.imprimir();
		System.out.println("***********************************");
		jogo2.imprimir();

	}

}
