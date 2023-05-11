package enumeradores;

public enum Setores {
	RH(100), COMPRAS(200), CPD(301), DIRETORIA(405), DP(410);
	
	private final int sala;

	private Setores(int sala) {
		this.sala = sala;
	}
	
	public int getSala() {
		return sala;
	}
	
	
	
}
