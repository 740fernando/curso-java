package br.com.sintaxe.filescanner.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\fsouviei\\OneDrive - everis\\Escritorio\\in.txt");
		Scanner sc =null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {//hasNextLine= testa se ha uma proxima linha no arquivo
				System.out.println(sc.nextLine());//nextLine vai ler a linha do arquivo
			}	
		}
		catch(IOException e) {
			System.out.println("error"+e.getMessage());
		}finally {
			if(sc!=null) {
				sc.close();
			}		
		}
	}

}
