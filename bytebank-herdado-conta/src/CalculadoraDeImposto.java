
public class CalculadoraDeImposto {
	
	private double totalImposto;
	// tudo que assinou o contrato Tributavel pode utilizar esse método
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;		
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
