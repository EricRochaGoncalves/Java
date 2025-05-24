package Hherança.test;

import Hherança.dominio.Endereco;
import Hherança.dominio.Funcionario;
import Hherança.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("11990");

        Pessoa pessoa = new Pessoa("João");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------------------------");

        Funcionario funcionario = new Funcionario("Jailson");
        funcionario.setCpf("987.654.321-00");
        funcionario.setSalario(3500.00);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua das Laranjeiras");
        endereco2.setCep("11990");
        funcionario.setEndereco(endereco2);

        funcionario.imprime();
    }
}

