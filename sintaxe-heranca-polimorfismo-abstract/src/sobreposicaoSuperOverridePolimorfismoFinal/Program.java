package sobreposicaoSuperOverridePolimorfismoFinal;
/*
 * Sobreposição ou sobrescrita

		• É a implementação de um método de uma superclasse na subclasse

		• É fortemente recomendável usar a
		anotação @Override em um método sobrescrito

		• Facilita a leitura e compreensão do
		código

	    • Avisamos ao compilador (boa prática)
 */

public class Program {
	/*
	 * Suponha que a operação de saque possui uma taxa no valor
	de 5.0. Entretanto, se a conta for do tipo poupança, esta taxa
	não deve ser cobrada. Como resolver isso?
	Resposta: sobrescrevendo o método withdraw na subclasse
 SavingsAccount,
	 */
	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex",1000.0);		
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Bob",1000.0,500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		//INTRDOUCAO A POLIMORFIMOS
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);//Upcasting
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		/*
		 * Importante entender
			• A associação do tipo específico com o tipo genérico é feita em tempo de
	execução (upcasting).
			• O compilador não sabe para qual tipo específico a chamada do método
	Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account):
		 * 
		 */

		System.out.println("INTRDOUCAO A POLIMORFIMOS");
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println("Podemos ter diferentes comportamentos"
				+ "\npara mesma operacao em objetos do mesmo tipo"
				+ "\nconforme os objetos nas quais elas apontam. ");
	}

}
