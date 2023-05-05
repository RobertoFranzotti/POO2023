package br.com.senai.herenca;

public class Moto extends Veiculo {
	private int cillindradas;

	public Moto(String placa, String chassi, String cor, double valor, int cillindradas) {
		super(placa, chassi, cor, valor);
		this.cillindradas = cillindradas;
	}

	public int getCillindradas() {
		return cillindradas;
	}

	public void setCillindradas(int cillindradas) {
		this.cillindradas = cillindradas;
	}
	
	@Override
	public double valorIPVA() {
		
		return valor * 0.02;
	}
}
