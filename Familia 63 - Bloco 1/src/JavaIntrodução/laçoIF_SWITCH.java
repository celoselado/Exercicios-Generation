package JavaIntrodução;

import java.util.Scanner;

public class laçoIF_SWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,media;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("Sua média foi de: %.2f ",media,"E sua nota 1 foi de: %.2f",n1);
		
		if(media>= 7 && media<=10) {
			System.out.println("\nAluno Aprovado!");
		}else if(media>=5 && media<7) {
			System.out.println("\nAluno de recuperação!");
		}else {
			System.out.println("\nAluno reprovado!");
		}
		
		System.out.println("\n\t\t Menu de elogios da familia 63!");
		System.out.println("\n1- Feliz");
		System.out.println("\n2- Acolhedora");
		System.out.println("\n3- está de Parabéns");
		System.out.println("\n4- Nota 10");
		System.out.println("\n5- É Show");
		System.out.println("\nEscolha o numero do elogio que deseja depositar: ");
		
		op = leia.nextInt();
		
		switch(op) {
		case 1: 
				System.out.println("\nA falimilia é feliz.");
				break;
		case 2:
				System.out.println("\nA familia é acolhedora.");
				break;
		case 3:
				System.out.println("\nA familia está de parabens.");
				break;
		case 4:
				System.out.println("\nA familia é nota 10.");
				break;
		case 5:
				System.out.println("\nA familia é show!");
				break;
		default:
				System.out.println("\nOpção indisponivel!");
		}
				
	}

}
