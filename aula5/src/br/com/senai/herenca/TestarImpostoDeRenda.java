package br.com.senai.herenca;

public class TestarImpostoDeRenda {
	
	public static void main (String[] args) {
		PessoaFisica pf = new PessoaFisica("Fulano",90000., "f@gmail.com", "233");
		PessoaJuridica pj = new PessoaJuridica("Xpto S/A",450000., "x@gmail.com", "234");
		
		
		System.out.println(pf);
		System.out.println(pj);
		System.out.println("O valor à pagar do PF é:"+ pf.imposto());	
		System.out.println("O valor à pagar da PJ é:"+ pj.imposto());
	}
}
