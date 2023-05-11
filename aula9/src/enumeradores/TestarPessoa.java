package enumeradores;

import enumeradores.Pessoa.EstadoCivil;

public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Carlos", "c@gmail.com", Setores.DIRETORIA, EstadoCivil.DIVORCIADO);
		System.out.println(pessoa);
		System.out.println(pessoa.getNome());
		
		Setores[] setor= Setores.values();
		for (int i = 0; i < setor.length; i++) {
			System.out.println(setor[i]);
		}
		
		System.out.println("-------------");
		for (Setores setores : Setores.values()) {
			System.out.println(setores);
		}
	}
}


