package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObjeto {
	public static void main(String[] args) {

		System.out.print("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cliente = new Cliente();

		System.out.println(cc.toString()); 
		System.out.println(cp);
		println(cp);
		println(cliente);
	}
	static void println() {

	}
	static void println(int a ) {

	}
	static void println(boolean valor) {

	}
	static void println(Conta conta ) {

	}
	static void println(Object object ) {

	}
}
