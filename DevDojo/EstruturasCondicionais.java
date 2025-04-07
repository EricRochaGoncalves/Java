package DevDojo;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 7000;

        double primeiroImposto = 130;

        double segundoImposto = 260;

        String paisDoCidadao = "Brasil";

        String situaçãoDoCidadão = "não é sonegador" ;
        

        

        if (paisDoCidadao.equals("outroPaís") && situaçãoDoCidadão.equals("sonegador")) {
            System.out.println("Ele não pagará impostos! já que está em outro país e está metendo o loko no leão da receita fodegeral!");
        }
        else if (paisDoCidadao.equals("outroPaís") ) {
            System.out.println("Ele não pagará impostos já que está em outro país!");
            
        } else {
            System.out.println(salario / primeiroImposto+" é o valor do primeiro imposto hahahhahaha e ainda tem o segundo hahaha");
            System.out.println(salario / segundoImposto+" é o valor do segundo imposto hahahhahaha SE FODEU!!");
        }
    }

}
