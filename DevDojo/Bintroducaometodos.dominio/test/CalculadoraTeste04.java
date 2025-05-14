package test;

import dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0); 
        System.out.println(calculadora.divideDoisNumeros2(20, 10));

        Calculadora calculadora2 = new Calculadora();
        calculadora.imprimeDivisaoDeDoisNumeros(20, 0);
        
    }
    
}
