
public class FluxoComError {
	//DUPLO CLIQUE NA LINHA PARA HABILITAR O DEBUG
	//F6- DEBUG MACRO
	//F5- DEBUG MICRO
	public static void main(String[] args)  {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException e) { // comando pipe (|) == OR 
			//System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();// Exibe o rastro da chamada do metodo
		}
		System.out.println("Fim do main");
	}


	private static void metodo1()  {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2()  {
		System.out.println("ini do metodo2");
		metodo2();
		//throw new MinhaException("deu muito errado ");
		System.out.println("Fim do metodo2");
	}
}
// para um desenvolvedor de excessoes existe 2 categorias
