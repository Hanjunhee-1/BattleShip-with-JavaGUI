package components;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import common.Button;
import common.PlayerColor;
import components.GameBoard.Board;
import components.GameBoard.Tile;
import components.Player.Player;
import components.Player.Players;

public class test {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        PlayerColor pc = new PlayerColor();
        Button button = new Button();
        Board board = new Board();

        frame.setVisible(true);
        frame.setSize(700, 300);
        frame.setLayout(new BorderLayout());

        Player p1 = new Player("p1", pc.playerColors.get("RED"));
        Player p2 = new Player("p2", pc.playerColors.get("BLUE"));
        Player p3 = new Player("p3", pc.playerColors.get("YELLOW"));
        Player p4 = new Player("p4", pc.playerColors.get("GREEN"));

        Players players = new Players();
        players.setPlayers(p1);
        players.setPlayers(p2);
        players.setPlayers(p3);
        players.setPlayers(p4);

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                Tile tile = new Tile("A");
                tile.setButtonText(tile.getShipName());
                tile.setButtonSize(40, 40);
                board.addTile(tile);
            }
        }

        button.setButtonText("click!!");

        frame.add(players, BorderLayout.NORTH);
        frame.add(board, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.pack();
    }
}
