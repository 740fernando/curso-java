package br.com.exceptions.sintaxe.trycatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * • Uma exceção é qualquer condição de erro ou comportamento
	inesperado encontrado por um programa em execução
	Em Java, uma exceção é um objeto herdado da classe:
• java.lang.Exception - o compilador obriga a tratar ou propagar
• java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
 * @author fsouviei
 *
 *Estrutura try-catch
	• Bloco try
	• Contém o código que representa a execução normal do trecho de código que
	pode acarretar em uma exceção
	• Bloco catch
	• Contém o código a ser executado caso uma exceção ocorra
	• Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)
 */
public class Program {
	public static void main(String[] args) {

		method1();
		System.out.println("End Program");

	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner (System.in);
		try {
			System.out.print("Digite 3 palavras : ");
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();// exibe a sequencia de chamadas que gerou a excessao
			sc.next();
		}catch(InputMismatchException e ) {
			System.out.println("Input Error");
		}
		System.out.println("***METHOD2 END***");
		sc.close();
	}

}
