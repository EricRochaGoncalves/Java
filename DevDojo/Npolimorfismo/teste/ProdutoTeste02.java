package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Lenovo Thinkpad", 1200);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        System.out.println("O valor com o imposto fica: " + (produto.calcularImposto() + produto.getValor()) );


    }
}
