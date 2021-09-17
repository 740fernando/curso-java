
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario = 1250.40;
		double salarioNovo;
		
		System.out.println("Meu salario é : "+ salario);
		
		salarioNovo= salario *2;
		double divisao = 3.14/2;
		
		System.out.println(salarioNovo);
		System.out.println("divisao : "+divisao);
		
		int outraDivisao = 5/2;
		
		System.out.println("Outra divisao : "+outraDivisao);//exibe 2 

		double novaTentativa = (double)5/2;
		System.out.println("Nova tentativa : "+novaTentativa);

		double novaTentativa2 = 5.0/2;	
		System.out.println("Nova tentativa 2 : "+novaTentativa2);

		double novaTentativa3 = 5/(double)2;	
		System.out.println("Nova tentativa 3 : "+novaTentativa3);
	}
}