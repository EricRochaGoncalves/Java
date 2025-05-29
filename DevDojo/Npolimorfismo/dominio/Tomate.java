package Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double VALOR_DO_IMPOSTO = 0.2;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o valor do tomate");
        return this.valor * VALOR_DO_IMPOSTO;
    }
}
