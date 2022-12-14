package ui;

import data.Conversion;
import game.Game;

import javax.swing.*;
import java.awt.*;

public class DrawInterface extends JLabel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Game.nextBlock.getColor());
        for (int i = 0; i < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; i++) {
            for (int y = 0; y < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][i].length; y++) {
                if (Game.nextBlock.getBounds()[Game.nextBlock.getRotation()] [i][y] == 1){

                    g.fillRect(Conversion.cellToCoord(1 + i),
                            Conversion.cellToCoord(y),32,32);
                }
            }
        }

        g.setColor(Color.lightGray);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.drawRect(i * 32 +32, j * 32, 32, 32 );

            }
        }

        g.setColor(Color.BLACK);
        g.drawRect(32,0, 128, 128);


        repaint();
    }

}
