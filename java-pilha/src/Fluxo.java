
public class Fluxo {

	//DUPLO CLIQUE NA LINHA PARA HABILITAR O DEBUG
	//F6- DEBUG MACRO
	//F5- DEBUG MICRO
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(Exception e) { // comando pipe (|) == OR 
			//System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();// Exibe o rastro da chamada do metodo
		}
		System.out.println("Fim do main");
	}


	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2()throws MinhaException {

		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i/0;
			//Conta c = null;
			//c.deposita();
			
		}
		throw new MinhaException("deu muito errado");
		//System.out.println("Fim do metodo2");
	}
}
