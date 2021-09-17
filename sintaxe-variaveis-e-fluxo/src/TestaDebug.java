import java.util.Locale;
import java.util.Scanner;

public class TestaDebug {
	public static void main(String[] args) {
		//BreakPoint- Ctrl+Shift+b
		//Iniciar DEBUG-• Botão direito na classe -> Debug as -> Java Application
		//F6 Executar uma linha 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
}
}

