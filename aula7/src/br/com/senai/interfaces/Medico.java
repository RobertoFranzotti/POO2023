package br.com.senai.interfaces;

public class Medico implements Consulta{
	private String nome;
	@Override
	public void recibo(double valor) {
		valor+=300 ;
		
	}
	@Override
	public String diagnostico() {
		
		return null;
	}
	@Override
	public void atualizarProntuario() {
		
		
	}
	

}
