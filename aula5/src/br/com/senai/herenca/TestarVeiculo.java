package br.com.senai.herenca;

public class TestarVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("ABC-0909", "2343", "Azul", 50000, 9000);
		VeiculoPasseio vp = new VeiculoPasseio("ZAER-2343", "234", "Branco", 22500, "Sedan");
		Moto m = new Moto("XPT-9090", "3434", "Preta", 5000, 125);
		
		
				
		System.out.println("Dados Caminhão: "+ c.getPlaca() + " " + c.getValor());
		System.out.println("O valor do IPVA é: " + c.valorIPVA());
		
		System.out.println("Dados veiculo passeio:"+ vp.getPlaca() + " " + vp.getValor());
		System.out.println("O valor do IPVA é: " + vp.valorIPVA());
		
		System.out.println("Dados da moto:"+ m.getPlaca() + " " + m.getValor());
		System.out.println("O valor do IPVA é: " + m.valorIPVA());
	}

}
