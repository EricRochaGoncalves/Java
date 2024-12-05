package DevDojo;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double salario = 50;
        String descontoDoFardo = "true";

        if (salario >= 30) {
            System.out.println("Eu vou comprar um fardo de agua com gás!");
            
        } else if(salario < 30 && descontoDoFardo.equals("true")){
            System.out.println("Eu vou comprar um fardo de agua com gás com desconto!");
        } else {
            System.out.println("Putz agora só mês que vem....");
        }
    }

}
