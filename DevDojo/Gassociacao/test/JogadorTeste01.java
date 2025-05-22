package Gassociacao.test;

import Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador [] Jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: Jogadores){
            jogador.imprime();

        }
    }
}
