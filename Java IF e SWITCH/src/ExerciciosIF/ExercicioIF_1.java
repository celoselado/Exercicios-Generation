package ExerciciosIF;

import java.util.Scanner;

public class ExercicioIF_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float a,b,c;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
	a = leia.nextFloat();
	System.out.println("Digite o segundo numero: ");
	b = leia.nextFloat();
	System.out.println("Digite o terceiro numero: ");
	c = leia.nextFloat();
	
	if(a+b<c) {
		System.out.println("A soma de "+a+" e de "+b+" é menor do que "+c);
	}else if(a+b>c) {
		System.out.println("A soma de "+a+" e de "+b+" é maior do que "+c);
	}else if(a+b==c) {
		System.out.println("A soma de "+a+" e de "+b+" é igual a "+c);
	}
		
	}

}
