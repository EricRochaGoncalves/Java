package PaginaInicial;

import javax.swing.*;
import java.awt.*;

public class JanelaComImagem {
    public static void main(String[] args) {
        // Criação da janela (JFrame)
        JFrame frame = new JFrame("Java");
        frame.setSize(500, 500); 
        frame.setLocationRelativeTo(null);  

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); 
                
                final ImageIcon img = new ImageIcon("src/PaginaInicial/img/java.png"); 

                // Desenha a imagem ajustada ao tamanho do painel

                g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), this); 
            }
        };

        
        frame.add(panel);

        
        frame.setVisible(true);
    }
}
