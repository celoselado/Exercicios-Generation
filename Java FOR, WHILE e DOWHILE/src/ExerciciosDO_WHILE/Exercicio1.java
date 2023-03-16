package ExerciciosDO_WHILE;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int num,numpos=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		do {
			System.out.println("Digite o valor a ser somado: ");
			num = leia.nextInt();
			if(num>0) {
				numpos += num;
			}
			
		}while(num != 0);
		System.out.println("--------------------------------------------------------------");
		System.out.println("A soma dos números positivos que foram inseridos é de: "+numpos);
		System.out.println("--------------------------------------------------------------");

	}

}
