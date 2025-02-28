import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
public class SnakeGame extends JPanel{
    private class  Tile {
        int x;
        int y;

        Tile(int x, int y){
            this.x = y;
            this.y = x;
        }
    }
    
    int boardHeight;
    int boardWidth;
    int tileSize = 25;

    Tile snakeHead;

    SnakeGame(int boardHeight, int boardWidth) {
        this.boardWidth = boardHeight;
        this.boardHeight = boardWidth;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);


        snakeHead = new Tile(5, 5);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Snake
        g.setColor(Color.green);
        g.fillRect(snakeHead.x, snakeHead.y, tileSize, tileSize);
    }
}
