package JavaIntrodução;

import java.util.Scanner;

public class LaçoDO_WHILE {

	public static void main(String[] args) {
		
		int tabu,x=1,result;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n------------------------------------------");
		System.out.println("Insira a tabuada que você deseja acessar: ");
		tabu = leia.nextInt();
		
		System.out.println("--------------------------------------------");
		
		do {
			result = tabu * x;
			System.out.println(tabu+" X "+x+" = "+result);
			x++;
			
		}while(x <= 10);
		System.out.println("------------------------------------------");

	}

}
