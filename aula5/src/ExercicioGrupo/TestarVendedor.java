package ExercicioGrupo;

import java.util.Scanner;

public class TestarVendedor {

	public static void main(String[] args) {
		Fixo fixo1 = new Fixo("Joana", "123456789",2000, 3);
		Fixo fixo2 = new Fixo("Maria", "321654987", 3000, 5);
		
		try (Scanner sc = new Scanner(System.in)) {
			char resposta = 'S';
			int opcaoVendedor;
			double valorVenda;
					
			
			do {
				System.out.println("---------------- SISTEMA DE VENDAS ------------");
				System.out.println("VENDEDORES:" + "\n1-Joana\n2-Maria");
				System.out.println("Escolha o Vendedor?");
				opcaoVendedor = sc.nextInt();
				System.out.println("Digite o valor da venda:");
				valorVenda = sc.nextDouble();
				if (opcaoVendedor == 1) {
					fixo1.calcularSalario(valorVenda);
				
				}else {
					fixo2.calcularSalario(valorVenda);
				}
				System.out.println("deseja Continuar (S/n)");
				resposta = sc.next().charAt(0);
				
			} while (resposta == 'S' || resposta == 's');
			
			System.out.println("Salario dos vendedores:");
			 System.out.println(fixo1);	
			 System.out.println(fixo2);	
			 System.out.println("Total Vendido:");
			 System.out.println(valorVenda + valorVenda);
		}
	}
}
