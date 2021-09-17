import java.util.Scanner;
import java.util.function.Function;

public class TestaFunction {
	public static void main(String[] args) {
		//Representam um processamento que possui um significado
		//Principais vantagens : modularizacao, delegacao e reaproveitamento

		//Dados de entrada e saida
		// - funcoes podem receber dados de entrada (parametro ou argumeto)
		// - funcoes podem ou nao retornar uma saida

		// Em OO, funcoes em classes receber o nome de "metodos"

		double x =Math.sqrt(25.0);
		System.out.println(x);

		//Fazer um programa para ler 3 numeros interios e mostrar
		// ma tela o maior deles

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher =max(a,b,c);
		showResult(higher);
		sc.close();
	}

	public static int max(int a, int b, int c) {

		int aux ;

		if(a>b && a>c) {
			aux=a;
		}else if(b>c) {
			aux=b;
		}else {
			aux=c;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = "+value);
	}
}