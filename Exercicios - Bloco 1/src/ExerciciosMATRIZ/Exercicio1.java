package ExerciciosMATRIZ;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[][] numero = new int[3][3];
		int linha,coluna,numeral,somadiagprinc=0,somadiagsec=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("\t MATRIZ");
		System.out.println("---------------------------");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nDigite um número para inserir na matriz 3X3: ");
				numero[linha][coluna] = leia.nextInt();
				
				if(linha == coluna) {
					somadiagprinc += numero[linha][coluna];
				}
				
				if(linha == 1 && coluna == 1) {	
					somadiagsec += numero[linha][coluna];
				}else if(linha == 0 && coluna == 2) {
					somadiagsec += numero[linha][coluna];
				}else if(linha == 2 && coluna == 0) {
					somadiagsec += numero[linha][coluna];
				}
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("\nOs numeros da diagonal principal são: "+numero[0][0]+", "+numero[1][1]+", "+numero[2][2]);
		System.out.println("Os numeros da diagonal secundaria são: "+numero[0][2]+", "+numero[1][1]+", "+numero[2][0]);
		System.out.println("A soma dos numeros da diagonal principal é de "+somadiagprinc);
		System.out.println("A soma dos numeros da diagonal secundaria é de "+somadiagsec);
	}

}
