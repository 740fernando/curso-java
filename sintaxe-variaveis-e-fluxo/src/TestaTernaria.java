import java.util.Locale;
import java.util.Scanner;

public class TestaTernaria {

	public static void main(String[] args) {
		//Estrutura opcional ao if-else quando se deseja
		// decidir um valor com base em uma condicao
		//sintaxe:
		// (condicao) ? valor_se_verdadeiro : valor_se_falso
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		
		double desconto = (preco<20.0)?preco *0.1 :preco*0.5;
		
		System.out.printf("Desconto : %.2f%n",desconto);
		

	}

}
