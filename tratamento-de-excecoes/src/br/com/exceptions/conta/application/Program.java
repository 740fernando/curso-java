package br.com.exceptions.conta.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.exceptions.conta.DomainException.DomainException;
import br.com.exceptions.conta.model.entites.Account;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		try {
		System.out.print("Enter account data : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc= new Account(number,holder,balance,withdrawLimit);
		
		
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		}catch (DomainException e) {
			System.out.println(e);
		}
		
		
		
	}

}
