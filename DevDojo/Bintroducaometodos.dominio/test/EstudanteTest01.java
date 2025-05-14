package test;

import dominio.Estudante;
import dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        
        impressoraEstudante impressora = new impressoraEstudante();



        estudante01.nome = "Leonardo";
        estudante01.idade = 13;
        estudante01.sexo = 'M';

        estudante02.nome = "Eduarda";
        estudante02.idade = 10;
        estudante02.sexo = 'F';

        impressora.Imprime(estudante01);
        impressora.Imprime(estudante02);


    }
}
