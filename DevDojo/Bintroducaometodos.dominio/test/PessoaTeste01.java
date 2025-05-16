package test;

import dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


        pessoa.setNome("Eric");
        pessoa.setIdade(19);

       // pessoa.imprime();

       System.out.println(pessoa.getNome());
       System.out.println(pessoa.getIdade());


       
    }
}
