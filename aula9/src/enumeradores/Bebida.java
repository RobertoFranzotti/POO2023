package enumeradores;

public enum Bebida {
	REFRIGERANTE("refrigerante", 6), SUCO("Suco de Laranja", 7),AGUA("Agua mineral", 2);
	
	private final String tipoBebida;
	private final double valor;
	
	private Bebida(String tipoBebida, double valor) {
		this.tipoBebida = tipoBebida;
		this.valor = valor;
	}
	public String getTipoBebida() {
		return tipoBebida;
	}
	public double getValor() {
		return valor;
	}
	
	

}
