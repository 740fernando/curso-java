
public class TesteSaca {
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.00);
		conta.saca(210.0);
		
		System.out.println(conta.getSaldo());
	}
}
