package DevDojo;

public class Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[5];

         nomes [0]= "Negan,";
         nomes [1]= "Carl,";
         nomes [2]= "Michonne,";
         nomes [3]= "Gleen, e";
         nomes [4]= "Lucile esmagadora de crânios ;)";

         System.out.println("Melhores personagens: ");

         for (int i = 0; i < nomes.length; i++) {
            
            System.out.println(nomes [i]);
         }




    }
}

