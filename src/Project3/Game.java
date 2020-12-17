package Project3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    JButton[] buttons = new JButton[9];
    boolean xTurn = true;
    int spotsFilled = 0;
    boolean gameOver= false;

    public Game() {
        init();
    }

    private void init() {
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);
        }
        resetBoard();
    }

    private void resetBoard(){
            for (int i = 0; i < 9; i++) {
                buttons[i].setText(Integer.toString(i + 1));
                buttons[i].setForeground(new Color(0, 0, 0));
                buttons[i].setBackground(new Color(210, 210, 210));
                buttons[i].setFont(new Font("TimesRoman", Font.BOLD, 28));
                buttons[i].setBorder(new LineBorder(Color.BLACK,1));

            }
            xTurn=true;
            gameOver=false;
            spotsFilled=0;

        }

    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonSelected = (JButton) e.getSource();

            if(buttonSelected.getText()!="X" && buttonSelected.getText()!="O" &&!gameOver) {
                buttonSelected.setText(xTurn ? "X" : "O");
                spotsFilled++;
                buttonSelected.setBackground(xTurn ? new Color(250,150,50):new Color(50,150,250));
                if(spotsFilled>4){
                    checkForWin();
                }
                if(spotsFilled==9&&!gameOver){
                    catsGame();
                }
                xTurn = !xTurn;
            }
            else if(gameOver){
                resetBoard();
            }
        }
        private void checkForWin(){
            for (int i = 0; i < 3; i++) {
                //check horizontal
                if(checkThree(3*i,3*i+1,3*i+2)){
                    return;
                }
                //check vertical
                if(checkThree(i,3+i,6+i)){
                    return;
                }
            }
            if(checkThree(0,4,8)){
                return;
            }
            if(checkThree(2,4,6)){
                return;
            }

        }

        private boolean checkThree(int a, int b, int c) {
            if (buttons[a].getText() == buttons[b].getText() && buttons[a].getText() == buttons[c].getText()) {
                gameOver = true;
                buttons[a].setBorder(new LineBorder(Color.YELLOW,3));
                buttons[b].setBorder(new LineBorder(Color.YELLOW,3));
                buttons[c].setBorder(new LineBorder(Color.YELLOW,3));

                return true;
            }
            return false;
        }

        private void catsGame(){
            for (int i = 0; i < 9; i++) {
                buttons[i].setForeground(new Color(255,255,255));
                gameOver=true;
            }
        }
    }
}

