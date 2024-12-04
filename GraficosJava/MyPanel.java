package GraficosJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    // Sobrescrevendo paintComponent para desenhar no painel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);

        // Desenhando um retângulo vazio
        g.setColor(Color.blue);
        g.drawRect(25, 25, 300, 50);

        // Desenhando um retângulo preenchido
        g.setColor(Color.red);
        g.fillRect(25, 100, 300, 50);

        // Desenhando um círculo vazio
        g.setColor(Color.green);
        g.drawOval(200, 180, 100, 100);

        // Desenhando um círculo preenchido
        g.setColor(Color.yellow);
        g.fillOval(25, 180, 100, 100);

        // Desenhando texto
        g.setColor(Color.red);
        g.setFont(new Font("Calibri", Font.BOLD, 40));
        g.drawString("Eu sou um texto em Java", 25, 320);
    }

    // Método principal para testar
    public static void main(String[] args) {
        JFrame frame = new JFrame("Painel com Gráficos");
        MyPanel panel = new MyPanel();

        frame.add(panel); // Adiciona o painel ao JFrame
        frame.setSize(400, 400); // Define o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true); // Torna a janela visível
    }
}

