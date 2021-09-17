package util;
//CLASSE UTILITARIA

// no caso da calculadora, os valores dos calculos nao mudam para calculadoras diferentes
//ou seja, sao calculos estaticos. O valor de pi tambem eh estatico
public class Calculator {
	public static final double PI= 3.14159;
	public static double cincunferencia(double radius) {
		return 2.0*PI*radius;
	}
	public static double volume(double radius) {
		return 4.0*PI*Math.pow(radius, 3)/3.0;
	}
}

