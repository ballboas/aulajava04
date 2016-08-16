package br.com.ericobalboa;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta bradesco = new Conta(1,"Erico Balboa",1000.0, 5000.0);		
		bradesco.sacar(25000.0);
	}

}
