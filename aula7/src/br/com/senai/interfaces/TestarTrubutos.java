package br.com.senai.interfaces;

import java.awt.List;
import java.util.ArrayList;

public class TestarTrubutos {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ana", 25000);
		Empresa e = new Empresa("XPTO Ltda", 100000);
		TotalTributos tt = new TotalTributos();
		
		tt.totalizarTributos(p);
		tt.totalizarTributos(e);
		
		System.out.println("Total geral de tributos: " + tt.getTotal());
		
		List testeListas = new ArrayList<>();
		testeListas.add("Azul");
		testeListas.add("Branco");
		testeListas.add("Amarelo");
		System.out.println(testeListas);
		
	}

}
