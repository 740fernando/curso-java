package classesabstratas;

import java.util.ArrayList;
import java.util.List;

/*
 	Se a classe Account não pode ser instanciada, por
que simplesmente não criar somente SavingsAccount
e BusinessAccount?
Resposta:
	• Reuso
	• Polimorfismo: a superclasse classe genérica nos permite tratar
de forma fácil e uniforme todos os tipos de conta, inclusive
com polimorfismo se for o caso (como fizemos nos últimos
exercícios). Por exemplo, você pode colocar todos tipos de
contas em uma mesma coleção.
• Demo: suponha que você queira:
• Totalizar o saldo de todas as contas.
• Depositar 10.00 em todas as contas.
 */

public class Program {

	public static void main(String[] args) {
		/*Account ac1 = new Account();// nao pode instanciar porque a classe eh abstract
		Account ac2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		Account ac3 = new BusinessAccount();
		 */
		List<Account> list =new ArrayList<>(); // Criando uma lista do tipo generico Account, poderemos manipular tanto objetos do tipo BusinessAccount quanto 
		//Saving Account.
		list.add(new SavingsAccount(1001,"Alex",500.00,0.01));
		list.add(new BusinessAccount(1002,"Maria",1000.0,400.0));
		list.add(new SavingsAccount(1004,"Bob",300.0,0.01));
		list.add(new BusinessAccount(1005,"Anna",500.0,500.0));

		double sum=0.0;
		for (Account acc : list) {
			sum+=acc.getBalance();
		}
		System.out.printf("Total balance : %.2f%n",sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Update balance for account"
					+ "%d : %.2f%n",acc.getNumber(),acc.getBalance());
		}
	}
}
