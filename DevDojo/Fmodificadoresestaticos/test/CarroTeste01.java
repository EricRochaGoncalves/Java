package Fmodificadoresestaticos.test;

import Fmodificadoresestaticos.dominio.Carro;

public class CarroTeste01 {
   public static void main(String[] args) {

    Carro.setVelocidadeLimite(180); // modificando o  valor de um atributo estatico

    Carro c1 = new Carro("BMW", 280);
    Carro c2 = new Carro("Mercedes Benz", 250);
    Carro c3 = new Carro("Audi", 240);

    c1.imprime();
    c2.imprime();
    c3.imprime();
   }

}
