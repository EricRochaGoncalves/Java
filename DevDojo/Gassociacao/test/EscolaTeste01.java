package Gassociacao.test;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya", "sensei", null);
        Professor [] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
