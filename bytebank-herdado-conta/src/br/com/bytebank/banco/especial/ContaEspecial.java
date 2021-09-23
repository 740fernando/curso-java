package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia,numero);
		//super();//chamada do construtor padrão da classe mae - fica implicito
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo +=valor;

	}

}
