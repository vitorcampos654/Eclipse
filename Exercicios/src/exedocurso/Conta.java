package exedocurso;



public class Conta {
	
	private String nome;
	private double saldo;
	
	
	  // Criar os metodo getter e setter 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	
	 // Criar o metodo sacar
	public double sacar(double v) {
		 return this.saldo = saldo -= v;
		 
	}  
	
	 // Criar o metodo depositar
	public double depositar(double v) {
		return this.saldo = saldo +=v;
	}
	// Criar o metodo status
	public void status() {
		System.out.println("Cliente:"+this.getNome());
		System.out.println("Saldo:"+this.getSaldo());
		
	}
	 
}