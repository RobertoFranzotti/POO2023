package br.com.senai.herenca;

public class PessoaFisica extends ImpostoDeRenda{
	private String cpf;

	public PessoaFisica(String nome, double rendimentos, String email, String cpf) {
		super(nome, rendimentos, email);
		this.cpf = cpf;
	}
	@Override
	public String toString() {		
		return super.toString() + "-" + cpf;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double imposto() {
		return rendimentos * 0.15;
	}
	}

