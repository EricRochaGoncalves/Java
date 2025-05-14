package dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public double divideDoisNumeros(double num1, double num2) {

        if (num2 == 0) {

            return 0;

        }

        return num1 / num2;

    }

    public double divideDoisNumeros2(double num1, double num2) {

        if (num2 != 0) {

            return num1 / num2;

        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println("O restultado é:" + num1 / num2);

    }

    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 32;
        System.out.println("Dentro do 'alteraDoisNumeros' " );
        System.out.println("num1: " + num1 );
        System.out.println("num2:" + num2);

        
    }
}
