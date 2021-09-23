package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		int a = 3 ;
		String nome = "Alura";//object literal
		//String outro= new String("Alura"); ma pratica
		String lowerCase = nome.toLowerCase();
	    String replace = nome.replace('A', 'a');
	    String upperCase= nome.toUpperCase();
		System.out.println(lowerCase);
		System.out.println(replace);
		System.err.println(upperCase);
		
		char  c ='A';
		
	    char d = 'a';
	    
	    String teste = nome.replace(c, d);
	    String sub = nome.substring(1);
	    int lenght = nome.length();
	    
	    System.out.println("teste : "+teste);
	    
	    System.out.println(nome.charAt(0));// mostra a posicao do elemento da string
	    
	    System.out.println(nome.indexOf("ur"));// mostra a posicao no vetor
	    
	    System.out.println("SubString : "+ sub);//recorta a stringa partir da posicao dada pelo parametro
	    
	    System.out.println(lenght);// mostra quantos caracteres tem numa string
	    
	    for(int i= 0 ; i<nome.length();i++) {
	    	System.out.println(nome.charAt(i));
	    }
	    String vazio = "        teste do vazio com bastante espaco         ";
	    
	    
	    System.out.println(vazio.isEmpty());// isEmpty = verifica se o string esta vazio e retorna um boolean
	    System.out.println("vazio.sem trim : "+vazio);
	    System.out.println("vazio.trim : "+ vazio.trim());//tira o espaco da string
	    System.out.println();
	    System.out.println("pergunta para string se tem alguam palavra chamada"
	    		+ " vazio "
	    		+ "\ne retorna um bolean :"+vazio.contains("vazio"));
	}

}
/*  System - O que eh? Visibilidade? Acesso? Pacote?
 *  classe - porque comeca com letra maiuscula do 
 *  visibilidade e a acesso -  public
 *  pacote java.lang
 *  
 *  out - atributo - primitivo, visibilidade public,acesso static, referencia ??
 *  
 *  println - metodo,public, nao static,sobrecarga, nao joga excecoes do tipo checked
*/
