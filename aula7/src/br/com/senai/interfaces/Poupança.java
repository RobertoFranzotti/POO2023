package br.com.senai.interfaces;

public class Poupança implements Conta {
	private String tirular;
	private double saldo;
		
	public Poupança(String tirular, double saldo) {
		super();
		this.tirular = tirular;
		this.saldo = saldo;
	}

	public String getTirular() {
		return tirular;
	}

	public void setTirular(String tirular) {
		this.tirular = tirular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		if (saldo > valor) {
			saldo-= valor;
		}

	}
	@Override
	public void deposito(double valor) {
		saldo+= valor;
	}

}
