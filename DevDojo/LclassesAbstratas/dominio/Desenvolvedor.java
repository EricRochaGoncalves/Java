package LclassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {


        this.salario = salario + salario * 0.2;

    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
