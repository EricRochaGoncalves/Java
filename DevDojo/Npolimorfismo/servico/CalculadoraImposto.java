package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório do imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }
    public static  void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório do imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto" );

        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor:" + produto.getValor());

        System.out.println("Imposto a ser pago" + imposto);



    }
}
