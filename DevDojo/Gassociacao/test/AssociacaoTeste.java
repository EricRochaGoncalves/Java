package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("João", 19);
        Professor professor = new Professor("Jiraya", "Sensei", null);

        Aluno [] alunosParaSeminarios = {aluno};

        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminarios, local);

        Seminario [] seminariosDisponiveis = {seminario};


        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
