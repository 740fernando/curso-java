package bytebank;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular=new Cliente();

	public void deposita(double deposit) {
		this.saldo +=deposit;	 //this - é um referencia para este objeto.
	}
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {

		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;	
	}
	public double getSaldo() {//método getter = para acessar a variavel private
		return this.saldo;
	}
}
