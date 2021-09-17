
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero){
		super(agencia,numero);//para passar os parametros para o construtor da classe conta
	}
	@Override
	public void deposita(double valor) {
		super.saldo+=valor; 
	
	}
}
