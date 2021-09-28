package br.com.sintaxe.manipulando.pastas;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		// Inserir caminha da pasta
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		//crio um objeto do tipo "File" com o caminho da pasta que foi passado
		File path =new File(strPath);
		
		//Exibir as pastas	
		File[] folders=path.listFiles(File::isDirectory);//.listFiles(File::isDirectory) - metodo para abstrair o nome do diretorio 
		
		System.out.println("FOLDERS : ");
		for(File folder : folders) { // percorre o vetor do folders do tipo File
			System.out.println(folder);//exibe o nome da pasta
		}
		//Exibir o arquivo 
		File[] files =path.listFiles(File::isFile);//listFiles(File::isFile)= metodo para abstrair o nome do arquivo
		System.out.println("FILES : ");
		for (File file : files) { //percorre o vetor "file"
			System.out.println(file); //exibe o nome dos arquivos
		}
		boolean success = new File(strPath +"\\subdir").mkdir();//.mkdir()-Cria uma pasta
		System.out.println("Directory created successfully "+success);
		
		sc.close();
	}
}
