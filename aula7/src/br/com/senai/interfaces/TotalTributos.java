package br.com.senai.interfaces;

public class TotalTributos {
	private double total;
	
	public double getTotal() {
		return total;
	}

	public void totalizarTributos(Tributos t) {
		total +=t.CalcularICMS();
		total += t.calcularImpostoDeRenda();
		
		System.out.println(t + "\n" + "ICMS " + t.CalcularICMS());
		System.out.println("IR " + t.calcularImpostoDeRenda()+ "\n");
	}
}
