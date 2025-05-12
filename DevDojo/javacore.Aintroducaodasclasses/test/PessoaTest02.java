package test;

import dominio.Pessoa;

public class PessoaTest02 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.sexo = 'F';
        pessoa.idade = 23;
        pessoa.nome = "Eduarda"; 

        System.out.println("---Dados da pessoa---");
        
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Sexo: " + pessoa.sexo);

        
    }
}
