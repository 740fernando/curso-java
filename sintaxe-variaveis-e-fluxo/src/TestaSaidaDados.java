import java.util.Locale;

public class TestaSaidaDados {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%4f%n",x);
		Locale.setDefault(Locale.US);// saida de dados padrao US
		System.out.printf("%.4f%n",x);// saida com ponto
		System.out.println("Resultado = "+x+" METROS");
		System.out.printf("Resultado = %.2f metros %n",x);
		
		//Para concatenar vários elementos em um mesmo comando
		String nome= "Fernando";
		int idade = 29;
		double renda = 4000.0;
		// %s string %d int %f ponto flutuante %n quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
	}
	
    
}
