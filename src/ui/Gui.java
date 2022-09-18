package ui;

import io.KeyHandler;
import javax.swing.*;

public class Gui {

    public static int width = 320, height = 572;

    JFrame jf;

    public void create(){
        jf= new JFrame("TetrisTutorial");
        jf.setSize(width + 17 + 200, height +41); //10 wide, 18 height
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.addKeyListener(new KeyHandler());
        jf.requestFocus();

        DrawGame dg = new DrawGame();
        setupDraw(dg, 0, 0, width +1, height +1);

        DrawInterface di = new DrawInterface();
        setupDraw(di, width+1, 1, width, height);

        jf.setVisible(true);
    }

    private void setupDraw(JLabel draw, int x, int y, int width, int height) {
        draw.setBounds(x,y,width,height);
        draw.setVisible(true);
        jf.add(draw);

    }


}
