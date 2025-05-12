package test;

import dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 35;
        professor.sexo = 'm';
        professor.nome = "Robson"; 

        System.out.println("Não vou mostrar como imprimir os dados! vá até PessoaTest02.java.");
    }
    
}
