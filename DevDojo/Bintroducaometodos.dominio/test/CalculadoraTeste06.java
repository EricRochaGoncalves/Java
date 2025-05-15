package test;

import dominio.Calculadora;

public class CalculadoraTeste06 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); 

        int[] numeros = {1, 2, 3, 4}; 

        calculadora.somaArray(numeros); 

        calculadora.SomaVarArgs( 1,2,3,5, 6, 7, 8);
    }
}

