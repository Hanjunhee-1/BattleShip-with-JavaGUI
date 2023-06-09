package components.Player;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Players extends JPanel {
    
    public Players() {
        this.setBorder(new LineBorder(Color.BLACK, 1));
        this.setLayout(new FlowLayout());

        this.setSize(640, 150);
    }

    public void setPlayers(Player player) {
        this.add(player);
    }
}
