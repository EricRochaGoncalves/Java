package test;

import dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Josemar";
        funcionario.idade = 49;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
        
        
    }
}
