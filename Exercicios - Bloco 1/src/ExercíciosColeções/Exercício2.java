package ExercíciosColeções;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList();
		
		Scanner leia = new Scanner(System.in);
		
		
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("----------------------------------------------");
		System.out.println("Digite o número que deseja buscar no Array: ");
		Integer verifica = leia.nextInt();
		
		if(numeros.contains(verifica)) {
			System.out.println("------------------------------------------------------");
			System.out.println("O numero existe dentro do Array e está na posição: "+numeros.indexOf(verifica));
			System.out.println("------------------------------------------------------");
		}else {
			System.out.println("----------------------------------------------");
			System.out.println("O numero não foi encontrado dentro do Array!");
			System.out.println("----------------------------------------------");
		}
		
		
		

	}

}
