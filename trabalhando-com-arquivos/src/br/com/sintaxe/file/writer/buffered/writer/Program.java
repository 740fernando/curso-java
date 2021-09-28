package br.com.sintaxe.file.writer.buffered.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
/*
 * Classes
	
	• FileWriter (stream de escrita de caracteres em de arquivos)
		• Cria/recria o arquivo: new FileWriter(path)
		• Acrescenta ao arquivo existente: new FileWriter(path, true)
	
	• BufferedWriter (mais rápido)
 */
	public static void main(String[] args) {
	
		// informacao para ser inserida
		String[]lines = new String[]{"Good morning","Good afternoon","Voce consegue!"};
		
		//caminho da pasta e nome do arquivo que sera criado
		String path = "C:\\Users\\fsouviei\\OneDrive - everis\\Escritorio\\out.txt";
		
		// cria objetos to tipo file no bloco try whith resources, sao responsaveis pela escrita de strens
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			//percorre as linhas
			for (String line : lines) {
				bw.write(line);//insere a informacao no arquivo
				bw.newLine();//vai para proxima linha
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
