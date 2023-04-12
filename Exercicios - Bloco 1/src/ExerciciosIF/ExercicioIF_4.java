package ExerciciosIF;

import java.util.Scanner;

public class ExercicioIF_4 {

	public static void main(String[] args) {
	
		String ossos,familia,comida;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O animal é VERTEBRADO ou INVERTEBRADO? ");
		ossos = leia.nextLine();
		System.out.println("O animal é uma AVE, MAMÍFERO, INSETO ou ANELÍDEO?");
		familia = leia.nextLine();
		System.out.println("O animal é CARNÍVORO, ONÍVORO, HERBÍVORO ou HEMATÓFAGO? ");
		comida = leia.nextLine();
		
		if(ossos.equalsIgnoreCase("VERTEBRADO")) {
			if(familia.equalsIgnoreCase("AVE")) {
				if(comida.equalsIgnoreCase("CARNIVORO")) {
					System.out.println("\nO animal é uma AGUÍA."); 

				}else {
					System.out.println("\nO animal é uma POMBA. ");
				}
			}else {
				if (comida.equalsIgnoreCase("ONIVORO")) {
					System.out.println("\nO animal é um HOMEM. ");
				}else {
					System.out.println("\nO animal é uma VACA. ");
				}
			
			}
		}else {
			if (familia.equalsIgnoreCase("INSETO")) {
				if (comida.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.println("\nO animal é uma PULGA. ");
				}else {
					System.out.println("\nO animal é uma LAGARTA. ");
				}
			}else {
				if (comida.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.println("\nO animal é uma SANGUESUGA. ");
				}else {
					System.out.println("\nO animal é uma Minhoca. ");
				}
			}
		}
		
	}

}
