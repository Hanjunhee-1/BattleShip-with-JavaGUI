package components.GameBoard;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Board extends JPanel {
    
    public Board() {
        this.setLayout(new GridLayout(10, 10));
    }

    public void addTile(Tile tile) {
        this.add(tile);
    }
}
