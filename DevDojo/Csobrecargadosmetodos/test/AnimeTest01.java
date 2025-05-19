package Csobrecargadosmetodos.test;

import Csobrecargadosmetodos.dominio.Anime;

public class AnimeTest01 {
   public static void main(String[] args) {

     Anime anime = new Anime();

     anime.init("Naruto", "Shounen", 500, "Cabaçice");

     anime.inprime();
     
   }
}