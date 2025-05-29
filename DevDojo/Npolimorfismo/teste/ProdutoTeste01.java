package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo Thinkpad T460", 1400);
        Tomate tomate = new Tomate("Tomate", 20);

        System.out.println("----------------------");

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
