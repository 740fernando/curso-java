package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		/*
		 * Conta cc1 = new ContaCorrente(22,22); Conta cc2 = new ContaCorrente(22,22);
		 * 
		 * boolean igual = cc1.ehIgual(cc2); System.out.println(igual);
		 */
		ArrayList<Conta> lista= new ArrayList<Conta>();
		
		//List<Conta> lista= new Vector<Conta>();
		
		//Collection<Conta> lista = new Vector<Conta>(); 
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);

		boolean existe = lista.contains(cc3);// retorna true ou false
		
		Conta ref = lista.get(0);

		System.out.println("Ja existe ?  "+ existe);

		System.out.println("-------");

		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
