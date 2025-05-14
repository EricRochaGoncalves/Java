package test;

import dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("'Dentro da calculadoraTeste05' " );
        System.out.println("num1: " + num1 );
        System.out.println("num2:" + num2);
    }
}
