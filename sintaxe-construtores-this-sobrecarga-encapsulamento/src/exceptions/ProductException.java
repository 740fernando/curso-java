package exceptions;

import javax.swing.JOptionPane;

public class ProductException extends RuntimeException{

	public ProductException() {
		JOptionPane.showMessageDialog(null,"Numero Negativo");
	}
}
