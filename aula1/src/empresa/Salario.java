package empresa;

public class Salario {

	public static void main(String[] args) {
		String nome = "Roberto";
		double salario = 3000.00; 
        double inss;
        
        System.out.println("Seu nome é: "+ nome);
        
        if (salario <= 1751.81) {
            inss = 0.08; 
        } else if (salario <= 2919.72) {
            inss = 0.09; 
        } else if (salario <= 5839.45) {
            inss = 0.10; 
        } else {
            inss = 0.11; 
        }
        double salarioDesconto = salario - (salario * inss); 
        
        System.out.println("Seu salario com desconto do INSS é: "+ salarioDesconto);
}
}
