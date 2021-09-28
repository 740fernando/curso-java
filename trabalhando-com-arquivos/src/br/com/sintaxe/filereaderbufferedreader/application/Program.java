package br.com.sintaxe.filereaderbufferedreader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Esquema manual de abrir e fechar uma Stream
public class Program {
	public static void main(String[] args) {

		String path = "C:\\Users\\fsouviei\\OneDrive - everis\\Escritorio\\in.txt";
		FileReader fr = null;//FileReader (stream de leitura de caracteres a partir de arquivos)
		BufferedReader br = null;//BufferedReader (mais rápido)

		try {
			fr= new FileReader(path);//estabelece um sequencia de leitura(stream) a partir do caminho passado entre ();
			br= new BufferedReader(fr);// o BufferedReader é instanciado a partir do FileReader, eh uma abstracao maior
			// eu inicio uma stream(sequencia de leitura) basica(fr) e instancio na stream de buffer para deixar mais rapido	
			//br= new BufferedReader(new FileReader(path)); PODERIA SER FEITO DESSA FORMA, POREM IRIA SER MAIS DIFICIL PARA FECHAR

			String line=br.readLine();//O readLine vai levar uma linha do arquivo, se o arquivo estiver no final ele vai retornar nulo

			while(line!=null) { // enquanto esse line for diferente de nulo, significa que leu com sucesso minha linha
				System.out.println(line);
				line= br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(fr!=null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
