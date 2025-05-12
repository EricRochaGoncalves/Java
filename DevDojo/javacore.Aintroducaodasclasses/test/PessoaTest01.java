package test;

import dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(); 

        pessoa.nome = "Eric";
        pessoa.idade = 19;
        pessoa.sexo = 'M';


        System.out.println("Dados da pessoa");
        System.out.println("---------------");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " +pessoa.idade);
        System.out.println("Sexo: " +pessoa.sexo);

        
    }
}
