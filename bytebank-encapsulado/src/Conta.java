

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // O total esta estático, assim sempre que for criado um novo objeto do tipo Conta,
	//não seria criado um novo total, mantendo o valor correto.
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("O total de contas é : "+Conta.total);
		
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("estou criando uma conta "+ this.numero);
	}

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
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero){ // métodos que alteram um atributo normalmente são void
		if(numero<=0) {
			System.out.println("nao pode valor <= 0");
			return;
		}
		this.numero=numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
