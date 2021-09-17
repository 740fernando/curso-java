
public class TestaMatriz {
	public static void main(String[] args) {
		double [][] mat = new double[4][4];

		double num = 10.541;
		
		System.out.printf("%.1f%n",num);
		
		//Inserindo os dados
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j <mat.length; j++) {
				mat[i][j] = (Math.random()*10.0);
			}
		}
		
		//Leitura
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j <mat.length; j++) {
				System.out.printf("%.1f%n",mat[i][j]);	
				
			}
		}
	}
}

