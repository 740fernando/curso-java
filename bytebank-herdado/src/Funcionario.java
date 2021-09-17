
public abstract class Funcionario  { // abstract é relacionado com heranca - nao pode instanciar dessa classe.
	
		private String nome;
		private String cpf; //private = visivel apenas na classe onde foi criada
		private double salario;
		//protected double salario; // protected = se torna visivel apenas na classe mãe e filha
		
		public Funcionario() {
		}
		
		public abstract double getBonificacao();
		
		//metodo sem corpo, nao ha implementacao
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		

	}

