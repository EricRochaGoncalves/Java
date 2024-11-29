import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Leão da receita federal: Digite seus gastos: ");
            n = teclado.nextInt();
            s += n;

            System.out.print("Quer ir em frente? hahahaah [S/N] ");
            resp = teclado.next();

            if (resp.equalsIgnoreCase("S")) {
                System.out.println("Você disse sim! Bora continuar roubando seu dinheiro hahaha!");
            } else {
                if (resp.equalsIgnoreCase("N")) {
                    System.out.println("Você disse não! Tá querendo fugir, né? Vai dar ruim!");
                } else {
                    System.out.println("Resposta inválida, digite apenas [S/N].");
                }
            }

            // Pausa para que a mensagem seja lida antes de continuar
            try {
                Thread.sleep(2000); // Pausa por 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (resp.equalsIgnoreCase("S")); 

        System.out.println("A soma de todos os impostos é " + s + ". Se ferrou hahaha compre Bitcoin!");
        teclado.close(); 
    }
}

