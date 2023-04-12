package ExerciciosFOR;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int inicio,fim,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n------------------------------");
		System.out.println("Digite o inicio da contagem: ");
		inicio = leia.nextInt();
		System.out.println("Digite o fim da contagem: ");
		fim = leia.nextInt();
		System.out.println("------------------------------");
		
		for(x = inicio;x <= fim;x++) {
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println(x+" É múltiplo de 3 e 5!");
			}
			
		}if(fim < inicio) {
			System.out.println("O Inicio/Fim inserido é inválido.");
			System.out.println("---------------------------------");
		}
		
	}

}
