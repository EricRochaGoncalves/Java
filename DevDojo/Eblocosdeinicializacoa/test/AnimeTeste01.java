package test;

import dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int epsodio: anime.getEpsodios()) {
            System.out.print(epsodio + " ");
            
        }
        

    }
}
