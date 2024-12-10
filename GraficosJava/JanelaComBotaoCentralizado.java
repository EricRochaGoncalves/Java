package GraficosJava;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class JanelaComBotaoCentralizado {
    public static void main(String[] args) {
        // Criar a janela
        JFrame frame = new JFrame("Janela com Botão Centralizado");
        frame.setSize(500, 500);  // Definir o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Centraliza a janela na tela
        frame.setLayout(new BorderLayout());  // Layout para centralizar o botão

        // Criar o botão
        JButton button = new JButton("Clique aqui!");
       
                button.setBackground(Color.WHITE);
                
        
        // Adicionar o botão ao centro da janela
        frame.add(button, BorderLayout.CENTER);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}

