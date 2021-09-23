package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		/*
		 * As classes que existem para cada tipo primitivo se chamam wrappers. 
		 * Isso porque elas "embrulham" o tipo primitivo do objeto, que internamente 
		 * guarda o valor primitivo. Elas existem para que haja compatibilidade com as coleções, 
		 * nos permitindo, por exemplo, guardar números dentro de uma lista.
		 */
		System.out.println(Integer.MIN_VALUE);// qual o min que int pode guardar
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		int idade = 29; //Integer
		//Integer idadeRef = new Integer(29);//Inicialização com o uso de uma classe wrapper
		Integer idadeRef = Integer.valueOf(29); 

		System.out.println(idadeRef.doubleValue());

		String s = args[0];//"12"

		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);


		int valor = idadeRef.intValue();//método intValue() é utilizado, ele nos devolve, justamente, o primitivo



		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing

	}

}
