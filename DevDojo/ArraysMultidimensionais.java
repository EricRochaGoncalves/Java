package DevDojo;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] dias = new int [3][3];

        dias [0][0] = 32;
        dias [0][1] = 64;
        dias [0][2] = 128;

        dias [1][0] = 256;
        dias [1][1] = 512;
        dias [1][2] = 1024;

        dias[2][0] = 2048;
        dias[2][1] = 4096;
        dias[2][2] = 8192;

        // Essa parte do código é apenas para exibir os dados multidimensionais.
        // Ninguém usaria isso em um projeto real, pois normalmente os dados seriam usados para coisas mais úteis.

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + "\t");
            }
           
        }
        System.out.println("Essa parte do código é apenas para exibir os dados multidimensionais.");
        System.out.println("Ninguém usaria isso em um projeto real, pois normalmente os dados seriam usados para coisas mais úteis.");


    }
    
}
