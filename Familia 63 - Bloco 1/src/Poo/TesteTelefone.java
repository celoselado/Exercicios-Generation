package Poo;

public class TesteTelefone {

	public static void main(String[] args) {


		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		
		Telefone telefone = null;
		
		int n = (int) (Math.random()*3.0); //gerar um numero aleatorio entre 0 e 3.
		System.out.println("\nO número sorteado foi: "+n);
		
		switch(n) {
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("\nErro inesperado...");
		}
		
		if(telefone != null) { // Não entendi como ele vai decidir se é celular, fixo ou publico e onde vai atribuir.
			telefone.disca("92324544");
			telefone.toca(2);
		}

	}

}