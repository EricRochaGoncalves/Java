package DevDojo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComDados {
    public static void main(String[] args) {
        // Arrays originais
        String[] nomes = new String[5];
        nomes[0] = "Jhon";
        nomes[1] = "Marry";
        nomes[2] = "Negan";
        nomes[3] = "Joana";
        nomes[4] = "Phelippe";

        String[] emails = new String[5];
        emails[0] = "jhondev@hotmail.com";
        emails[1] = "marrychristimas@devmail.com";
        emails[2] = "negansmith@gmail.com";
        emails[3] = "jhoanacrossrose@gmail.com";
        emails[4] = "phelippedev@hotmail.com";

        String[] senhas = new String[5];
        senhas[0] = "Jhon@dev2002";
        senhas[1] = "HappyMarryChristimas";
        senhas[2] = "Little_pig_Little_pig_let_me_in";
        senhas[3] = "JhoanaDeveloper2002";
        senhas[4] = "PhelippeDeveloper2001";

        // Criar janela
        JFrame frame = new JFrame("Tabela de Dados");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Criar e personalizar botão
        JButton mostrarTabela = new JButton("Mostrar Tabela");
        mostrarTabela.setBackground(Color.WHITE);  // Cor de fundo do botão
        mostrarTabela.setForeground(Color.BLACK);  // Cor do texto
        mostrarTabela.setFont(new Font("Calibri", Font.BOLD, 14));  // Fonte do botão
        mostrarTabela.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));  // Borda do botão
        frame.add(mostrarTabela);

        // Ação do botão
        mostrarTabela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Montar texto com as arrays originais
                String texto = "";
                for (int i = 0; i < nomes.length; i++) {
                    texto += "Nome: " + nomes[i] + "\n";
                    texto += "Email: " + emails[i] + "\n";
                    texto += "Senha: " + senhas[i] + "\n";
                    texto += "-----------------------------\n";
                }

                // Criar a área de texto para mostrar os dados
                JTextArea textArea = new JTextArea(texto);
                textArea.setEditable(false);  // Não permitir edição
                textArea.setFont(new Font("Courier New", Font.PLAIN, 12));  // Fonte da área de texto
                textArea.setBackground(Color.LIGHT_GRAY);  // Cor de fundo da área de texto
                textArea.setForeground(Color.BLACK);  // Cor do texto

                // Adicionar a área de texto dentro de uma barra de rolagem
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(450, 300));  // Tamanho da janela de dados

                // Exibir os dados na janela
                JOptionPane.showMessageDialog(frame, scrollPane, "Dados dos Usuários", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Exibir janela
        frame.setVisible(true);
    }
}


