import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		/* 
		int number = Integer.parseInt(JOptionPane.showInputDialog(null," Enter account number : "));
		 String name = JOptionPane.showInputDialog(" Enter account holder : ");
		 char respostDeposit = Char.parseChar(JOptionPane.showInputDialog("Is there initial deposit(y/n)"));
		 */
		Account cc = new Account (Integer.parseInt(JOptionPane.showInputDialog(null,"Insira sua conta")),
				 JOptionPane.showInputDialog(null," Nome : "),
				Double.parseDouble(JOptionPane.showInputDialog(null," Value ")));
		
		JOptionPane.showMessageDialog(null, cc);
		cc.mostraTela();
	
	}
}
