package br.com.ericobalboa.bancocazalbe;

public class GerenteMain {
	public static void main(String[] args) {

		Cliente clienteBalboa = new Cliente(1, "Erico Balboa", "Avenida das alamedas");
		Cliente clienteJose = new Cliente(2, "Jose da Silva", "Rua das Avenidas");
		Cliente clienteFrancisco = new Cliente(3, "Chico Botico", "Estrada das Ruas");

		Conta contaDoBalboa = new Conta(clienteBalboa, 100, 1, 1000.0, 500.0);
		Conta contaDoJose = new Conta(clienteJose, 110, 2, 10000.0, 5000.0);
		Conta contaDoFrancisco = new Conta(clienteFrancisco, 120, 3, 43000.0, 1000.0);

		contaDoBalboa.depositar(2000);
		contaDoJose.sacar(100);
		contaDoFrancisco.transferencia(contaDoJose, 10000.0);

		contaDoBalboa.imprimeExtrato();
		contaDoJose.imprimeExtrato();
		contaDoFrancisco.imprimeExtrato();

	}

}
