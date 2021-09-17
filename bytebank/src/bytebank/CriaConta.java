package bytebank;

import java.util.Scanner;

public class CriaConta {
	
	public static void main(String[] args) {
	
		Conta primeiraConta = new Conta();

		Scanner sc = new Scanner(System.in);
		
		
		primeiraConta.deposita(250.00);
		primeiraConta.agencia=314;
		
		System.out.printf(" Saldo : %.2f%n",primeiraConta.getSaldo());	
		System.out.println();
				
		Conta segundaConta = new Conta();
		segundaConta.deposita(250.00);
		segundaConta.agencia=314;
		
		System.out.println("Primeira conta tem "+primeiraConta.getSaldo());
		System.out.println("Segunda conta tem "+segundaConta.getSaldo());
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.numero);
		
		if(primeiraConta == segundaConta){
			System.out.println("Sao a mesmissima conta");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		sc.close();
		
	}
}
