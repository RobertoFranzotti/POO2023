package br.com.senai.herenca;

public abstract class ImpostoDeRenda {
	protected String nome;
	protected double rendimentos;
	protected String email;

	
	public ImpostoDeRenda(String nome, double rendimentos, String email) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
		this.email = email;
	}
	@Override
	public String toString() {
		return nome + "-" + email + "-" + rendimentos ;
	}
	//OVERLOAD
	/*public String imprimirDados() {
		return nome + "-" + email + "-" + rendimentos ;
	}*/
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getRendimentos() {
		return rendimentos;
	}


	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public abstract double imposto();
		
}
