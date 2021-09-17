import javax.swing.JOptionPane;

public class Account {

	private int number;
	private String name;
	private double balance;

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public Account(int number, String name, double valor) {
		this.number = number;
		this.name = name;
		this.balance = valor;
	}
	public void deposit (double valor ) {
		this.balance+=valor;  	
	}
	public void withdraw (double valor ) {
		this.balance-=valor+5.00;  	
	}
	@Override
	public String toString() {
		return "Account : "+this.number
				+" Holder : "+this.name
				+" Balance : "+this.balance;
	}

	public void mostraTela() {

		int op=0;
		
		do {
		 op = Integer.parseInt(JOptionPane.showInputDialog("1- Deposit \n2- Withdraw \n3- Fim"));
		
		switch (op) {
		case 1:
			double deposit= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
			deposit(deposit);
			JOptionPane.showMessageDialog(null, toString());
			break;
		case 2:
			double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
			withdraw(withdraw);
			JOptionPane.showMessageDialog(null, toString());
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"FIM");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Numero invalido");
			break;
		}
		}while(op!=3);
		
	}


}
