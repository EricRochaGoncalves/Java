package Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {

        // Pra que você tá lendo isso? Não tem nada melhor pra fazer? 
        // Vai codar alguma coisa útil... esse comentário nem devia te interessar.



        Scanner teclado = new Scanner(System.in);

        System.out.println("=========================");

        System.out.print("Olá, qual é o seu nome? | ");
        System.out.print("What is your name? : ");

        String nome = teclado.nextLine();

        System.out.print("Seu nome é: " + nome + "? | ");
        System.out.print("Your name is: " + nome + "? : ");

        System.out.print("Digite 'sim' ou 'não' | Type 'yes' or 'no': ");

        String resposta = teclado.nextLine().toLowerCase();

        boolean isName = resposta.equals("sim") || resposta.equals("yes");

        if (isName) {
            System.out.println("Muito prazer " + nome + "!");
        } else {
            System.out.println("Então qual é seu nome?");
            nome = teclado.nextLine();
            System.out.println("Muito prazer " + nome + "!");
        }

        System.out.println(nome + ", quantos anos você tem? | How old are you? :");

        int idade = teclado.nextInt();
        teclado.nextLine();

        if (idade < 12) {
            System.out.println("Você é uma criança ainda, tome 10 reais!");
            System.out.println(
                    "{ Você ganhou 10 reais, guarde com responsabilidade... eu sei que você não vai fazer isso :) }");
        } else if (idade <= 17) {
            System.out.println("Você é bem novo, " + nome + "! Já terminou os estudos?");
            System.out.println("You are very young, " + nome + "! Have you finished school?");

            System.out.print("Digite 'sim' ou 'não' | Type 'yes' or 'no': ");
            resposta = teclado.nextLine().toLowerCase();

            if (resposta.equals("sim") || resposta.equals("yes")) {
                System.out.println("Parabéns, " + nome + "! Você já terminou os estudos!");
                System.out.println(nome + ", o que está fazendo da vida agora? | What are you doing now? :");
                teclado.nextLine();
            } else {
                System.out.println("Uma hora os estudos terminam e você será um adulto, " + nome + "!");
                System.out.println("Você irá começar a trabalhar, então aproveita enquanto pode!");
            }
        } else {
            System.out.println("Você já é um adulto, " + nome + ". Já está trabalhando? | You are already an adult, "
                    + nome + ". Are you working?");

            System.out.print("Digite 'sim' ou 'não' | Type 'yes' or 'no': ");
            resposta = teclado.nextLine().toLowerCase();

            if (resposta.equals("sim") || resposta.equals("yes")) {
                System.out.println("Parabéns! Você já está trabalhando!");

                System.out.println(nome + ", do que você trabalha?");
                resposta = teclado.nextLine();

                System.out.println("Legal!!!");

            } else if (resposta.equals("não") || resposta.equals("no")) {

                System.out.println("Tudo bem, sem pressa!");

            
            }
        }
        teclado.close();
    }
}
