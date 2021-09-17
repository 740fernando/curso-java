package util;

public class CurrencyConverter {
	
	private final static double  iof = 1.06;
	
	public static double cotacao(double totalReal, double totalDolar) {
		return (totalReal*totalDolar)*iof;
	}
}
