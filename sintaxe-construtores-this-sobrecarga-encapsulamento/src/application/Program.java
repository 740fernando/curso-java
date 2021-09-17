package application;

import javax.swing.JOptionPane;
/*
 * 
 * Regra geral básica
	• Um objeto NÃO deve expor nenhum atributo (modificador de acesso
private)
	• Os atributos devem ser acessados por meio de métodos get e set
 */

import entities.Product;
import exceptions.ProductException;

public class Program {

	public static void main(String[] args) {
		String name;
		double price=0;
		int quantity ;
		try {
			name= JOptionPane.showInputDialog(null,"Enter product data: ");
			
			price = Double.parseDouble(JOptionPane.showInputDialog(null,"Price : "));
			if(price<0) {
				throw new ProductException();
			}
			quantity= Integer.parseInt(JOptionPane.showInputDialog(null,"Quantity in stock:"));

			Product product= new Product(name,price,quantity);

			JOptionPane.showMessageDialog(null, product);

			int opc=0;
			do {
				opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1-Adicionar \n2-Remover \n3-Finalizar"));

				switch(opc) {
				case 1:
					quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number "
							+ "of products to be added in stock : "));
					product.addProducts(quantity);
					JOptionPane.showMessageDialog(null,"Produto atualizado"+ product);


					break;
				case 2:
					quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"\"Enter the number of products "
							+ "to be removed from stock: \" "));
					
						product.removeProducts(quantity);
						JOptionPane.showMessageDialog(null,"Produto atualizado"+ product);
					
					
					break;
				case 3:
					JOptionPane.showConfirmDialog(null, "Finalizado");
					break;
				default:
					JOptionPane.showConfirmDialog(null, "Numero Invalido");			
				}
			} while(opc!=3);
		}catch(ProductException e) {
			if(price<0) {
				System.out.println(e);
			}
		}

	}
}