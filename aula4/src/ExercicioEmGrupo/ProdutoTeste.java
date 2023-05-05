package ExercicioEmGrupo;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta = 'S';

        do {
        	
            System.out.println("Produto: ");
            String descricao = sc.next();
            System.out.println("Valor: ");
            double valor = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            

            Produto produto = new Produto(descricao, valor, quantidade);
            double icms = produto.cacularIcms();
            
            System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValor() + 
                                "\nTotal: " + (produto.getQuantidade() * produto.getValor()) +
                                "\nICMS: " + produto.cacularIcms());

            System.out.println("Deseja Continuar (S/s)? ");
            resposta = sc.next().charAt(0);
        } while (resposta=='S' || resposta == 's');


    }

}
