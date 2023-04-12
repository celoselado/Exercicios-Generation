package JavaIntrodução;

import java.util.Scanner;

public class LaçoWHILE {

	public static void main(String[] args) {
	
		int somapar=0, contimpar=0, numero;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somapar += numero;	
			}else {
				contimpar++;
			}
			System.out.println("\nDigite outro valor, caso queira parar, digite 0 (zero)!");
			numero = leia.nextInt();
		}System.out.println("\n------------------------------------------------------");
		 System.out.println("\nA soma de todos os numeros pares inseridos é de: "+somapar);
		 System.out.println("A quantidade de numeros impares inseridos foram de: "+contimpar);
		
		

	}

}
