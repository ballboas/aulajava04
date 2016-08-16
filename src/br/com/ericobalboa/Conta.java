package br.com.ericobalboa;

public class Conta {
	
	int    numero;
	String nomeTitular;
	double saldo;
	double limite;
	
	public Conta(int numero, String nomeTitular, double saldo, double limite){
		this.numero 	 = numero;
		this.nomeTitular = nomeTitular;
		this.saldo 		 = saldo;
		this.limite      = limite;
	}
	
	public void sacar(double valor){
		
		if(valor > this.saldo+this.limite){
			System.out.println("Não é possível sacar fora do limite.");
		} else {
			this.saldo -= valor;
		}		
	}

}
