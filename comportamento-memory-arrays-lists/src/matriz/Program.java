package matriz;

import java.util.Scanner;

public class Program {
	/*
	 * • Em programação, "matriz" é o nome dado a arranjos bidimensionais
			• Atenção: "vetor de vetores"
			• Arranjo (array) é uma estrutura de dados:
			• Homogênea (dados do mesmo tipo)
			• Ordenada (elementos acessados por meio de posições)
	 		Alocada de uma vez só, em um bloco contíguo de memória
	 • Vantagens:
			• Acesso imediato aos elementos pela sua posição
	• Desvantagens:
			• Tamanho fixo
			• Dificuldade para se realizar inserções e deleções

			Fazer um programa para ler um número inteiro N e uma matriz de
		ordem N contendo números inteiros. Em seguida, mostrar a diagonal
		principal e a quantidade de valores negativos da matriz.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int [][] mat = new int[2][3];// instanciamento de matriz na memoria

		System.out.printf("Digite %d numeros : ",2*3);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j]= sc.nextInt();			
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println("================MAIN DIAGONAL==================");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i==j) {
					System.out.print(mat[i][j]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("================SOMA DE NUMEROS==================");
		int soma=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				soma+=mat[i][j];
			}
		}
		System.out.printf("O total eh %d ",soma);
		System.out.println("OBS: A MATRIZ TAMBEM TEM A PROPRIADADE .LENGTH");
	}
}