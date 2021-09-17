
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
		//super();//chamada do construtor padrão da classe mae - fica implicito
	}
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		double valorASacar = valor+0.2;
		super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo+=valor; 
		
	}
	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
}
