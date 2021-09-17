package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*Em programação, "vetor" é o nome dado a arranjos unidimensionais
	 *Arranjo (array) é uma estrutura de dados:
		• Homogênea (dados do mesmo tipo)
		• Ordenada (elementos acessados por meio de posições)
		• Alocada de uma vez só, em um bloco contíguo de memória 
		
	   	• Vantagens:
			• Acesso imediato aos elementos pela sua posição
		• Desvantagens:
			• Tamanho fixo
			• Dificuldade para se realizar inserções e deleções
			
			Fazer um programa para ler um número inteiro N e a altura de N
	pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
	altura média dessas pessoas.
	*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		double [] vet = new double[x];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i]=sc.nextDouble();
		}
		double soma=0;
		
		for (int i = 0; i < vet.length; i++) {
			soma+=vet[i];
		}
		double  media = soma/x;
		
		System.out.printf("A media eh : %.2f%n",media);
		sc.close();
	}
}

