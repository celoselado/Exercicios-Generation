package ExerciciosDeReforço;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float[] valor = new float [5];
		float maiorValor=0;
		int x;

		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("--------------------------------");
			System.out.println("Digite o "+(x+1)+"º valor: ");
			valor[x] = leia.nextFloat();
			
			if(valor[x] > maiorValor) {
				maiorValor = valor[x];
				
			}
			
		}
		
		System.out.println("--------------------------------");
		System.out.println("O maior valor inserido foi o: "+maiorValor);
		System.out.println("--------------------------------");
	}

}
