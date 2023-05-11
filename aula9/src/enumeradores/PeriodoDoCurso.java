package enumeradores;

//ENUM não pode ter new
public enum PeriodoDoCurso {
	INTEGRAL("Terça e Quinta", 40, 2500),
	NOTURNO("Segunda e Quarta", 30, 1899),
	MANHA("Sexta", 20, 1000);
	
	private String diaSemana;
	private int cargaHoraria;
	private double valor;
	
	private PeriodoDoCurso(String diaSemana, int cargaHoraria, double valor) {
		this.diaSemana = diaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;		
	}
	@Override
	public String toString() {
		return diaSemana + " " + cargaHoraria + " " + valor;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
