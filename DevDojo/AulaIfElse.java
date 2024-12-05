package DevDojo;

public class AulaIfElse {
    public static void main(String[] args) {
        int idade = 22;

       if (idade >= 18 ){
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else System.out.println(" Não autorizado a comprar bebidas alcoólicas!");

        String bracoDaMinhaMae = "quebrado";
        if (bracoDaMinhaMae.equals("quebrado")) {

            System.out.println("Não autorizada a comprar bebidas alcoólicas! sua velha cachaceira!");


            
        }
        int idadeDaPessoa = 22;

        if (idadeDaPessoa < 13) {
            System.out.println("Você é uma criança");
            
        } else if (idadeDaPessoa >=13 && idadeDaPessoa <= 17){
            System.out.println("Você é um adolecente!");

        } else {
            System.out.println("Você é um adulto!");

        }

        

    }

}
