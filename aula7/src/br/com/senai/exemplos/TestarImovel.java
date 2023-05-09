package br.com.senai.exemplos;

public class TestarImovel {

	public static void main(String[] args) {
		Imovel imovel = new Imovel("Centro ", 289000);
		Imovel imovel2 = new Imovel("Bingen", 310000);
	
		Proprietario p1 = new Proprietario("Juliana", imovel);
		Proprietario p2 = new Proprietario("Alex", imovel2);
		
		System.out.println("O nome do Proprietario do Imovel 1 é:" + p1.getNome());
		System.out.println("Os dados do Imovel que esse proprietario comprou:" + p1.getImovel());
		System.out.println("Imposto que o proprietario vai pagar é:"+ p1.getImovel().calcularImpostoTransmissao());;
	
	
	}

}
