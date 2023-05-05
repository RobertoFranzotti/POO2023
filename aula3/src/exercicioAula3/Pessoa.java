package exercicioAula3;

public class Pessoa {
	// Encapsulando atributos 
	private String nome;
	private double altura, peso;
	
	/* atribuir valores ao atributo - this = significa que e do atributo da classe*/
	public void setnome(String nome) {
		if(nome==null) {
			System.out.println("Nome Invalido");
		}else {
			this.nome = nome;
		
	}
}	
	// automatizar esse get tem que ir em source - generate getter and setter
	public String getNome() {
		return nome;
	}	
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	// automatizar esse set tem que ir em source - generate getter and setter
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	// Encapsulado - visivel somente para esta classe
	private double calcularIMC() {
			return peso/(altura*altura);
	}
	
	public String resultadoIMC() {
		if (calcularIMC() < 18.5) {
			return "Abaixo do peso!";
		} else if (calcularIMC() <= 24.9) {
			return "peso normal!";
		} else {
			return "Acima do peso!";
		}
			//System.out.println();
	}	
}


