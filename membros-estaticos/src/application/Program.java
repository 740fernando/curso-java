//METODO 01
package application;

import java.util.Locale;
import java.util.Scanner;
/*
 *  São membros que fazem sentido independentemente de objetos. Não
	precisam de objeto para serem chamados. São chamados a partir do
	próprio nome da classe.
 */

public class Program {

	public static final double PI= 3.14159;// final - serve para falar que uma vez atribuido o valor nao pode mudar mais
	// padrao para constante é letra maiuscula

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();

		double c = cincunferencia(radius);

		double v = volume(radius);

		System.out.printf("Circunferencia : %.2f%n",c);
		System.out.printf("Volume : %.2f%n",v);
		System.out.printf("PI : %.2f%n",PI);
		sc.close();
	}
	public static double cincunferencia(double radius) {
		return 2.0*PI*radius;
	}
	public static double volume(double radius) {
		return 4.0*PI*Math.pow(radius, 3)/3.0;
	}
}


