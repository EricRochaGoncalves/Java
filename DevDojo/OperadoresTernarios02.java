package DevDojo;

public class OperadoresTernarios02 {
    public static void main(String[] args) {
        int idade =17;
        String categoria;

        if (idade >= 18) {
            categoria = "adulta";
        }
        else if (idade >= 15 && idade < 18) {
            categoria = "infanto-juvenil";
        }
        else {
            categoria = "juvenil";
        }
        System.out.println("A categoria do jogador de futebol americano é "+ categoria+"!");
    }
    
}
