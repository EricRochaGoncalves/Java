package miniprojetos;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print(" Leão da receita federal: Digite seus gastos: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer ir em frente? hahahaah [S/N] ");
            resp = teclado.next();

        } while (resp.equalsIgnoreCase("S"));

        System.out.println("A soma de todos os impostps é " + s + " se ferrou hahaha compre Bitcoin");
        teclado.close();
    }
}
