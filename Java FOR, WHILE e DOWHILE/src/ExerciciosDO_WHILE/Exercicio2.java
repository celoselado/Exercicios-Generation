package ExerciciosDO_WHILE;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num,prim=0;
		float media,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--------------------------");
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if(num%3==0 && num!=0) {
				soma += num;
				prim++;				
			}
		}while(num!=0);
		media = soma/prim;
		System.out.println("-----------------------------------------------------");
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		System.out.println("-----------------------------------------------------");

	}

}
