package br.com.senai.herenca;

public class PessoaJuridica extends ImpostoDeRenda{
	private String cnpj;

	public PessoaJuridica(String nome, double rendimentos, String email, String cnpj) {
		super(nome, rendimentos, email);
		this.cnpj = cnpj;
	}
	@Override
	public String toString() {
		return super.toString() + "-" + cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double imposto() {
		return rendimentos * 0.20;
	}

}
