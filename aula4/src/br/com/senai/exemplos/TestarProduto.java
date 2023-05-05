package br.com.senai.exemplos;

import javax.swing.JOptionPane;

public class TestarProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do produto"));
		String descricao = JOptionPane.showInputDialog("Descrição:");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));
		double valorReajuste = Double.parseDouble(JOptionPane.showInputDialog("Valor do reajuste"));
		
		
		produto.setCodigo(codigo);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		produto.atualizarValor(valorReajuste);
		
		JOptionPane.showMessageDialog(null, produto.getDescricao() + "\n" + produto.getValor());
		
		
	}

}
