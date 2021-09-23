package br.com.exceptions.conta.model.entites;

import br.com.exceptions.conta.DomainException.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		validaValor(number);
		validaValor(balance);
		validaValor(withdrawLimit);
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWhithdrawLimit() {
		return withdrawLimit;
	}
	public Double deposit(Double amount) {
		validaValor(amount);
		return balance+=amount;
	}
	public Double withdraw(Double amount) {
		validaOperacao(amount);
		return balance-=amount;
	}
	public boolean validaValor(double amount) {
		if(amount<=0) {
			throw new DomainException("Nao pode inserir numeros negativos ou neutros");
		}
		return true;
	}
	public boolean validaOperacao(double amount) {
		if(amount<=0) {
			throw new DomainException("Nao pode inserir numeros negativos ou neutros");
		}
		if(amount>this.withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount>this.balance) {
			throw new DomainException("Not enough balance");
		}

		return true;
	}


}
