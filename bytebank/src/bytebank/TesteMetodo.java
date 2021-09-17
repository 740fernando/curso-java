package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaDoFernando = new Conta();
		contaDoFernando.deposita(100) ;
	    contaDoFernando.deposita(50);
		System.out.println("Saldo conta do Fernando: "+contaDoFernando.getSaldo());
		boolean conseguiuRetirar= contaDoFernando.saca(20);
		System.out.println(" Novo saldo : "+contaDoFernando.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Conta da marcela #01 : "+contaDaMarcela.getSaldo());
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoFernando);
		if(sucessoTransferencia) {
			System.out.println("Transferencia foi feita com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println("Saldo conta da Marcela: "+contaDaMarcela.getSaldo());
		System.out.println("Saldo conta do Fernando: "+contaDoFernando.getSaldo());
		
	
		System.out.println(contaDoFernando.titular);
		
	}

}
