import org.omg.CORBA.portable.ValueBase;

public class TesteConversao {
	public static void main (String[] args) {
		double salario = 1270.50;
		float pontoFlutuante =3.14f;
		int valor = (int)salario;
		System.out.println("Valor : "+ valor);
		
		long numeroGrande= 32432423523L;
		
		double valor1= 0.2;
		double valor2= 0.1;
		double total = valor1+valor2;
		
		System.out.println(pontoFlutuante);
		
		System.out.println(total);
		
	}
}