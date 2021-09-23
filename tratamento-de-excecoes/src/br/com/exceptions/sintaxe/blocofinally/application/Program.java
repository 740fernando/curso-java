package br.com.exceptions.sintaxe.blocofinally.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
/**
 * Bloco finally
		try {
		}
		catch (ExceptionType e) {
		}
		finally {
		}
	• É um bloco que contém código a ser executado independentemente de ter
	ocorrido ou não uma exceção.
	• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
	recurso específico ao final do processamento.
 * 
 */
	public static void main(String[] args) {

		File file = new File("C:\\Users\\fsouviei\\OneDrive - everis\\Escritorio\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file : " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}

	}

}
