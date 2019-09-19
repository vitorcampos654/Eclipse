package exedocurso;

public class Contaex2 {
	
	private int numero;
	private String titular;
	private double saldo;
	
	
	 // Criar com 2 argumentos
	
	public Contaex2(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		
	}
	 // Criar construct tres argumentos
	public Contaex2(int numero, String titular, double saldoInicial) {
		this.numero = numero;
		this.titular = titular;
		//this.saldo = saldoInicial;
		depositar(saldoInicial);
	}
	  // -----------------------------------------------------------------------
	  // Criar os metodos getter e setter
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String t) {
		this.titular = t;
	}
	public double getSaldo() {
		return saldo;
	}
	// Criar o metodo depositar
	public void depositar(double valor) {
		 saldo = saldo +=valor;
	}
	// Criar o metodo sacar
	public void sacar(double valor) {
		 saldo = saldo -=valor + 5.0;
	}
	// Criar a class toString
	public String toString() {
	return 	"Conta:"
			+numero 
			+ ", Titular:"
			+titular
			+", Saldo: $"
			+ String.format("%.2f", saldo);
		
	}
	 
}
