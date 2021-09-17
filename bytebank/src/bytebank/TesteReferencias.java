package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta= new Conta();
		primeiraConta.deposita(300);;
		System.out.println("saldo da primeira conta : "+primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo do segunta conta : "+segundaConta.getSaldo());
		

		
		System.out.println();
		System.out.println("Segunda conta "+segundaConta.getSaldo());
		System.out.println("Primeira conta "+primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta){
			System.out.println("Sao a mesmissima conta");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
