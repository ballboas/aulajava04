package br.com.ericobalboa.bancocazalbe;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private double limite;
	private Cliente cliente;

	public Conta(Cliente cliente, int agencia, int numero, double saldo, double limite) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero  = numero;
		this.saldo   = saldo;
		this.limite  = limite;
	}

	public void sacar(double valor) {

		if (valor > this.saldo + this.limite) {
			System.out.println("Nใo ้ possํvel sacar fora do limite.");
		} else {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void imprimirTitular(Cliente cliente) {
		System.out.println(cliente);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void transferencia(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public void imprimeExtrato() {
		System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
		System.out.println("");
		System.out.println("BANCO CAZALBษ");
		System.out.println("");
		System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
		System.out.println("");
		System.out.println("AGสNCIA: "+this.agencia);
		System.out.println("");
		System.out.println("CONTA: "+this.numero);
		System.out.println("");
		System.out.println("TITULAR: "+this.cliente.getNome());
		System.out.println("");
		System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
		System.out.println("");
		System.out.println("Saldo da Conta: "+this.saldo);
		System.out.println("");
		System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
		System.out.println("");
		System.out.println("(Antes de imprimir pense no meio ambiente)");
		System.out.println("");
		System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
	}

	/*
	 * public void abrirConta(Cliente cliente) { this.id = cliente.id; this.nome
	 * = cliente.nome; this.endereco = cliente.endereco; }
	 * 
	 * public void fecharConta(Cliente cliente) {
	 * 
	 * }
	 */

}
