package GraficosJava;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        frame.setSize(500, 500);
        frame.setVisible(true);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        

    }
}
