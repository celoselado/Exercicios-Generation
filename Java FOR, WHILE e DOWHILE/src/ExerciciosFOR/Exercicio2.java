package ExerciciosFOR;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x,numero,somapar=0,somaimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n--------------------------");
		for(x=1;x<=10;x++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				somapar++;
			}else {
				somaimpar++;
			}
		}System.out.println("-------------------------------------------");
		 System.out.println("A quantidade de numero pares foi de: "+somapar+"\nE aquantidade de numeros impares foi de: "+somaimpar);
		 System.out.println("-------------------------------------------");
	}

}
