package br.com.sintaxe.exercicios.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

import br.com.sintaxe.exercicios.entities.Product;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		Collection<Product> list= new ArrayList();

		System.out.println("Enter file path : ");
		//String path = sc.nextLine(); CASO QUEIRA ESCREVER O NOME DO ARQUIVO
		String path ="C:\\Users\\fsouviei\\OneDrive - everis\\Documentos\\CURSO JAVA\\sourcefile.csv";
		System.out.println("Foi chumbado = "+path);
		sc.next();
		
		//Cria o sourceFile do tipo "File" passando path como paramentro
		File sourceFile = new File(path);
		
		//getParent = retorna o nome do caminho  em String para a variavel "sourceFolder" que vai ser responsavel de guarda o caminho onde sera guardada a pasta
		String sourceFolder = sourceFile.getParent();

		//cria a pasta out
		boolean success = new File(sourceFolder+"\\out").mkdir();

		//variavel guarda o caminho do arquivo que sera criado
		String targetFile = sourceFolder+"\\out\\summary.csv";

		//cria os objetos para leitura de arquivo
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
			
			//readLine() - realiza a leitura do arquivo sourceFile, que foi passado no parametro do try
			String itemCsv = br.readLine();
			
			//euqnato o arquivo for diferente de null
			while(itemCsv != null ) {
				String[] fields =itemCsv.split(",");// vai pegar as informacoes delimitadas com virgula e inserir em um espaco do veto
				String name = fields[0]; // atribui a posicao do vetor a uma variavel
				double price = Double.parseDouble(fields[1]);
				int quantity= Integer.parseInt(fields[2]);

				list.add(new Product(name,price,quantity));// adiciona as informacoes no objeto list

				itemCsv=br.readLine();//le a proxima informacao		
			}
			//cria os objetos para escrita de arquivo
			try(BufferedWriter bw= new BufferedWriter(new FileWriter(targetFile))){
				for(Product item : list) { //percorre o objeto list
					bw.write(item.getNome()+","+String.format("%.2f",item.total())); // escreve o nome e total do produto, dentro do arquivo que foi passado no parametro do try
					bw.newLine();//passa para proxima linha
				}
				System.out.println(targetFile+" CREATED! ");
			}catch(IOException e) {
				System.out.println("Error writing file : "+e.getMessage());
			}
		}catch(IOException e ) {
			System.out.println("Error reading file : "+e.getMessage());
		}
		sc.close();
	}
}