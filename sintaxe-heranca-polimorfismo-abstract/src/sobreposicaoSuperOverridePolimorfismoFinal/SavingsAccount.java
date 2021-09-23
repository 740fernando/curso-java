package sobreposicaoSuperOverridePolimorfismoFinal;
/*
 * 				Palavra super
	É possível chamar a implementação da superclasse usando a palavra super.
	
	@Override
	public void withdraw(double amount) {
	super.withdraw(amount);
	balance -= 2.0;
	
	}
		Classes e métodos final
	• Palavra chave: final
	• Classe: evita que a classe seja herdada
	public final class SavingsAccount {
	• Método: evita que o método sob seja sobreposto
	
	Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
saque normalmente da superclasse, e descontar mais 2.0.
 */

public final class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number,holder,balance);
		this.interestRate = interestRate;
	}

	public SavingsAccount(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance +=balance + interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance-=amount;
	}

}
/*
 * Pra quê?
	• Segurança: dependendo das regras do negócio, às vezes é desejável
garantir que uma classe não seja herdada, ou que um método não
seja sobreposto.
	• Geralmente convém acrescentar final em métodos sobrepostos, pois
sobreposições múltiplas podem ser uma porta de entrada para
inconsistências
	• Performance: atributos de tipo de uma classe final são analisados de
forma mais rápida em tempo de execução.
	• Exemplo clássico: String
	*/
