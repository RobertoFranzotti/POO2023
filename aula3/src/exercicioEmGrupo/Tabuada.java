package exercicioEmGrupo;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	        System.out.println("Informe um nº inteiro");
	        int a = ler.nextInt();
	        System.out.println("\n+--Resultado--+\n");

	        for (int i = 1; i < 10; i++) {
	            
	            if ((i * a) < 10) {
	                System.out.println("|  " + i + " * " + a + " = " + i * a + " |");
	            } else {
	                System.out.println("|  " + i + " * " + a + " = " + i * a + " |");
	            }

	        }
	        System.out.println("+-------------+\n\n");

	    }

	}