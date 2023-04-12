package ExercíciosColeções;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercício3 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.println("Digite os numeros: ");
		
		for(int x=0;x<10;x++) {
			int num = leia.nextInt(); 
			numeros.add(num);
		}
		
		
		Iterator<Integer> numeros2 = numeros.iterator();
		
		System.out.println("----------------------------------------------");
		System.out.println("Os dados listados foram: ");
		System.out.println();
		while(numeros2.hasNext()) {
			System.out.println(numeros2.next());
		}
		
		
	}

}
