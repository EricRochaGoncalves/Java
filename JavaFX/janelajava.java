package JavaFX;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class janelajava {
    public static void main(String[] args) {
        //Janela 
        JFrame janela = new JFrame();

        janela.setVisible(true);



        JLabel label = new JLabel("Olá, eu sou uma janela em Java!", JLabel.CENTER);
        janela.add(label);

        //Estilização da janela 

        janela.setSize(700, 700);
        label.setFont(new Font("calibri", Font.BOLD, 35));
        label.setForeground(Color.gray);

    //Background da janela caso precise mudar;

        //janela.getContentPane().setBackground(new Color(100, 30, 100));

    //Fim da estilização da janela 

    
    }
}
