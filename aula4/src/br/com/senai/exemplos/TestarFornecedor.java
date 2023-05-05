package br.com.senai.exemplos;

import javax.swing.JOptionPane;

public class TestarFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("234352", "ABC 456" );
		Fornecedor fornecedor2 = new Fornecedor("34343434", "XTPO 123");
		Fornecedor fornecedor3 = new Fornecedor("546582","WC3 ");
		
		fornecedor2.setNome("XTPO 123");
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor2.getNome());
		System.out.println(fornecedor3.getNome());
		System.out.println("Total geral de fornecedores:"+Fornecedor.getContador());
		
		
	}

}