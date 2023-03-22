package Exercícios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {

		List<String> cores = new ArrayList();
		int r;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.println("SISTEMA DE ORDENAR CORES POR ORDEM ALFABÉTICA");
		System.out.println("----------------------------------------------");
		
		for(r=0;r<5;r++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("----------------------------------------------");
		System.out.println("As cores que foram inseridas foram: ");
		System.out.println(cores);
		
		Collections.sort(cores);
		
		System.out.println("----------------------------------------------");
		System.out.println("Ordenando as cores ficam respectivamente: ");
		System.out.println(cores);
		System.out.println("----------------------------------------------");
		
	

	}

}
