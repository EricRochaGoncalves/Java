package test;

import dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford";
        carro1.modelo = "Maverick";
        carro1.ano = 1973;

        carro2.nome = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 1964;

        carro1 = carro2;

        System.out.println("Carro 1:");
        System.out.println("---------");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("ano: " + carro1.ano);
        System.out.println("----------");

        System.out.println("Carro 2:");
        System.out.println("---------");
        System.out.println("Nome:" + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("----------");

    }
}
