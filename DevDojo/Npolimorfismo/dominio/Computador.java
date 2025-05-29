package Npolimorfismo.dominio;

public class Computador extends Produto{

    public static final double VALOR_DO_IMPOSTO = 0.1;


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * VALOR_DO_IMPOSTO;

    }

}
