package DevDojo;

public class ExerciciosDeDados {
    public static void main(String[] args) {
        String [] nomes = new String[5];
        nomes [0] = " Jhon";
        nomes [1] = " Marry";
        nomes [2] = " Negan";
        nomes [3] = " Joana";
        nomes [4] = " Phelippe";

        String [] emails = new String[5];

        emails [0] = "jhondev@hotmail.com" ;
        emails [1] = "marrychristimas@devmail.com";
        emails [2] = "negansmith@gmail.com";
        emails [3] = "jhoanacrossrose@gmail.com";
        emails [4] = "phelippedev@hotmail.com";

        String [] senhas = new String[5];

        senhas[0] = "Jhon@dev2002" ;
        senhas[1] = "HappyMarryChristimas" ;
        senhas[2] = "Little_pig_Little_pig_let_me_in";
        senhas[3] = "JhoanaDeveloper2002";
        senhas[4] = "PhelippeDeveloper2001";


        for (int i = 0; i < 5; i++) {
            System.out.println("Nome: "+nomes[i]);
            System.out.println("Email:"+emails[i]);
            System.out.println("Senha:"+senhas[i]);
            
        }

        
    }

   


}
