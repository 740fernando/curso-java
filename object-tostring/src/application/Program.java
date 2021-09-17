package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product= new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name : ");
		product.name=sc.nextLine();
		System.out.print("Price : ");
		product.price=sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity= sc.nextInt();

		/*System.out.println(product.name+" , "+product.price+" , "+" , "
		+product.quantity);	*/
		System.out.println(product);

		int opc=0;
		int quantity;
		
		do {
			System.out.println("1-Adicionar \n2-Remover \n3-Finalizar");
			opc = sc.nextInt();
			switch(opc) {
				case 1:
					System.out.print("Enter the number of products to be added in stock : ");
					quantity= sc.nextInt();
					product.addProducts(quantity);
					System.out.println("Produtos atualizados");
					System.out.print(product);
					System.out.println();
					break;
				case 2:
					System.out.print("Enter the number of products to be removed from stock: ");
					quantity = sc.nextInt();
					product.removeProducts(quantity);
					System.out.println("Produtos atualizados");
					System.out.print(product);
					System.out.println();
					break;
				case 3:
					System.out.print("Finalizado");
					break;
				default:
					System.out.println("Numero invalido");
			}
		} while(opc!=3);
		sc.close();
	}
}
