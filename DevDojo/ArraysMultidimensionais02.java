package DevDojo;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int [3][];

        arrayInt[0] = new int [2]; 
        arrayInt[1] = new int [4]; 
        arrayInt[2] = new int [8]; 


        for(int[] arrayBase: arrayInt){
            for (int num: arrayBase){
                System.out.println(num);
            }

        }

    }
}

