package LclassesAbstratas.teste;

import LclassesAbstratas.dominio.Desenvolvedor;
import LclassesAbstratas.dominio.Funcionario;
import LclassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("King", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Eric", 10000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);

    }
}
