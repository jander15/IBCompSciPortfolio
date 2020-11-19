package Project3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setTitle("Tic Tac Toe");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().add(new Game());
        jf.setBounds(100,100,300,350);
        jf.setVisible(true);
    }
}
