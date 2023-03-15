package ExerciciosSWITCH;

import java.util.Scanner;

public class ExercicioSWITCH_1 {

	public static void main(String[] args) {
		
		int produt,quant,preço;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMENU DE COMIDAS DE BEBIDAS");
		System.out.println("\n1- Cachorro quente - R$10.00");
		System.out.println("\n2- X-Salada - R$15.00");
		System.out.println("\n3- X-Bacon - R$18.00");
		System.out.println("\n4- Bauru - R$12.00");
		System.out.println("\n5- Refrigerante - R$8.00");
		System.out.println("\n6- Suco de Laranja - R$13.00");
		System.out.println("---------------------------------");
		System.out.println("\nDigite qual você deveja: ");
		produt = leia.nextInt();
		System.out.println("\nQuantia: ");
		quant = leia.nextInt();
		
		switch(produt) {
		case 1:
			produt = 10;
			preço = produt * quant;
			System.out.printf("\nSeu Cachorr Quente já está sendo preparado!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		case 2:
			produt = 15;
			preço = produt * quant;
			System.out.printf("\nSeu X-Salada já está sendo preparado!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		case 3:
			produt = 18;
			preço = produt * quant;
			System.out.printf("\nSeu X-Bacon já está sendo preparado!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		case 4:
			produt = 12;
			preço = produt * quant;
			System.out.printf("\nSeu Bauru já está sendo preparado!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		case 5:
			produt = 8;
			preço = produt * quant;
			System.out.printf("\nSeu Refrigerante já será levado até você!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		case 6:
			produt = 13;
			preço = produt * quant;
			System.out.printf("\nSeu Suco de Laranja já está sendo preparado!\nO valor total do seu pedido é de "+preço+" reais");
		break;
		default:
			System.out.println("A opção de pedido selecionada é inválida!");
		}
	
	}

}
